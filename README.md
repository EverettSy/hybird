# 安装GraalVM
安装GraalVM很简单，相当于新增一个JDK

GraalVM官网的快速开始页面提供了4种不同系统的安装方式

* Linux
* macOS
* Windows
* Docker Container
这里选择macOS安装方式，没有提供dmg安装方式，需要在[Github](https://github.com/graalvm/graalvm-ce-builds/releases
)下载压缩包

> https://github.com/graalvm/graalvm-ce-builds/releases

![](https://cdn.jsdelivr.net/gh/EverettSy/ImageBed@master/uPic/bAuEcL.png)

下载后用tar命令解压，移动到/Library/Java/JavaVirtualMachines目录下(需要sudo)

```bash
sudo tar -xzf graalvm-ce-java<version>-darwin-aarch64-<version>.tar.gz
 
sudo mv graalvm-ce-java<version>-<version> /Library/Java/JavaVirtualMachines
```
# 在IDEA中配置GraalVM
在IntelliJ IDEA 2022.3 (Ultimate Edition)中新建项目hybrid，并添加GraalVM到JDK
![](https://cdn.jsdelivr.net/gh/EverettSy/ImageBed@master/uPic/DIwHlf.jpg)

# 代码测试
新建一个controller，添加一个接口，返回一个字符串

![](https://cdn.jsdelivr.net/gh/EverettSy/ImageBed@master/uPic/bsEi6N.png)


## 体验多语言特性

![](https://cdn.jsdelivr.net/gh/EverettSy/ImageBed@master/uPic/l7O0Z6.png)

执行结果如下

![](https://cdn.jsdelivr.net/gh/EverettSy/ImageBed@master/uPic/xAS2Uj.png)

示例代码

```java

@RestController
@RequestMapping("/hybrid")
public class HybirdController {

    @GetMapping("/hello")
    public String hello() {

        // Java代码作为启动代码
        System.out.println("Hello GraalVM! from Java");
        System.out.println("Let's go with JavaScript");

        Context polyglot = Context.create();
        polyglot.eval("js", "print('Hello GraalVM! from JavaScript')");
        return "hello";
    }
}
```