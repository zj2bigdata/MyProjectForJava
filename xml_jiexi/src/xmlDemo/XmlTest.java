package xmlDemo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlTest {
	public static void main(String[] args) throws Exception {
		File f=new File("file/mapper.xml");
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		 DocumentBuilder db=dbf.newDocumentBuilder();
		 //获取文档对象
		 Document doc=db.parse(f);
		 //获取文档对象下的所有标签名为mapper的节点
		 NodeList nl=doc.getElementsByTagName("mapper");
		 //获取第一个mapper节点
		 Node mapper=nl.item(0);
		 Node nameNode=mapper.getAttributes().item(0);
		 String nameapaceN=nameNode.getNodeName();
		 String namesapceV=nameNode.getNodeValue();
		 System.out.println("<"+"mapper"+" "+nameapaceN+"=\""+namesapceV+"\">");
		 //获得当前节点下所有子节点
		 NodeList nlc=mapper.getChildNodes();
		 for(int i=0;i<nlc.getLength();i++){
			String noN=nlc.item(i).getNodeName();
			short noT=nlc.item(i).getNodeType();
			if(noT==1){
				Element node_el=(Element) nlc.item(i);
				
				NamedNodeMap nnm=nlc.item(i).getAttributes();
				StringBuilder sb =new StringBuilder();
				for(int j=0;j<nnm.getLength();j++){
					Node attr=nnm.item(j);
					String nnmName=attr.getNodeName();
					String nnmValue=attr.getNodeValue();
					sb.append(nnmName+"=\""+nnmValue+"\" ");
				}
				System.out.println("<"+noN+" "+sb.toString()+">");
				System.out.println("\t"+node_el.getTextContent().trim());
				System.out.println("<"+noN+">");
			}
			
		 }
//		 Element e=(Element)mapper;
//		 Attr namespace=e.getAttributeNode("namespace");
//		 Class.forName(namespace.getValue());
		 
		 System.out.println("</mapper>");
	}
}
