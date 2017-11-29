package bridage.demo3;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	//�÷������ڴ�XML�����ļ�����ȡ����������,������һ��ʵ������
	public static Object getBean(String args){
		try{
			//����DOM�ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/bridage/demo3/config.xml"));
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = null;
			if(args.equals("color")){
				classNode  = nl.item(0).getFirstChild();
			}else if(args.equals("pen")){
				classNode = nl.item(1).getFirstChild();
			}
			String cName = classNode.getNodeValue();
			//ͨ����������ʵ�����󲢽��䷵��
			Class c = Class.forName("bridage.demo3."+cName);
			Object obj = c.newInstance();
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
