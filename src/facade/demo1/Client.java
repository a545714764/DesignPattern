package facade.demo1;

/*
 * 某系统需要提供一个文件加密模块，加密流程包括三个操作，分别是读取源文件、加密、保存加密之后
 * 的文件。读取文件和保存文件使用流来实现，这三个操作相对独立，其业务代码封装在三个不同的类中
 * 现在需要提供一个统一的加密外观类，用户可以直接使用该加密外观类完成文件的读取、加密和保存三
 * 个操作，而不需要与每一个类进行交互，使用外观模式设计该加密模块，要求编程模拟实现。
 */
public class Client {
	public static void main(String[] args) {
		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("src.txt", "des.txt");
	}
}
