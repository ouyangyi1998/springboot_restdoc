# springboot利用spring restdoc创造api文档
- 源代码来自github @forezp 感谢
- Collections.singletonMap() 构造 map(单例)
- mockmvc可以模拟请求 mockmvc.perform(get("/")) localhost:8080/
   - andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确,对返回的数据进行的判断 
   - status().isOk() content.string(containsString(...))
   - andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）
   - document(key) print()
   - andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）
- SpringbootRestdocAppliactionTests必须为public修饰，否则mvn package会报错
- @AutoConfigureRestDocs注解开启了生成snippets文件，并指定了存放位置。
***
## springboot版本为1.5.2 
- 如果使用2.0版本 junit部分方法位置被修改。。。
- 先跑webLayerTest.shouldReturnDefaultMessage()方法,会在target/home出现四个adoc文件
- 默认情况下，snippets是Asciidoctor格式的文件，包括request和reponse，另外其他两种httpie和curl两种流行的命令行的http请求模式。
- 在main创建asciidoc文件夹，建立adoc文件，写出request与response路径
- 需要使用asciidoctor-maven-plugin插件，mvnw package命令就可以生成文档了 
- 在/target/generated-docs下有个index.html
