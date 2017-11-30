package state.demo2;
/*
 * 状态模式实例2之论坛用户等级
 * 在某论坛系统中,用户可以发表留言,发表留言将增加积分;用户也可以回复留言,回复留言也将增加积分;
 * 用户还可以下载文件,下载文件将扣除积分.该系统用户分为三个等级,分别是新手、高手和专家，这三个等级
 * 对应三种不同的状态，这三种状态分别定义如下：
 * 1.如果积分小于100分，则为新手状态，用户可以发表留言、回复留言，但是不能下载文件。如果积分大于1000分，
 * 则转换为专家状态；如果积分大于等于100分，则转换为高手状态。
 * 2.如果积分大于等于100分但小于1000分，则为高手状态，用户可以发表留言、回复留言，还可以下载文件，而且
 * 用户在发表留言时还可以获取双倍积分。如果积分小于100分，则转换为新手状态；如果积分大于等于1000分，则转
 * 换为专家状态；如果下载文件后积分小于0，则不能下载该文件。
 * 3.如果积分大于等于1000分，则为专家状态，用户可以发表留言、回复留言和下载文件，用户除了在发表留言时获取
 * 双倍积分外，下载文件只扣除所需积分的一半。如果积分小于100分，则转换为新手状态；如果积分小于1000分，但
 * 大于等于100，则转换为高手状态；如果下载文件后积分小于0，则不能下载该文件。
 */
public class Client {

	public static void main(String[] args) {
		ForumAccount account = new ForumAccount("张三");
		account.writeNote(20);
		System.out.println("-------------------------");
		account.downloadFile(20);
		System.out.println("-------------------------");
		account.replyNote(100);
		System.out.println("-------------------------");
		account.writeNote(40);
		System.out.println("-------------------------");
		account.downloadFile(80);
		System.out.println("-------------------------");
		account.downloadFile(150);
		System.out.println("-------------------------");
		account.writeNote(1000);
		System.out.println("-------------------------");
		account.downloadFile(80);
		System.out.println("-------------------------");

	}

}
