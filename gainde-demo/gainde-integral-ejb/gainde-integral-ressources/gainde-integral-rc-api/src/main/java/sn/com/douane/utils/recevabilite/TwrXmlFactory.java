package sn.com.douane.utils.recevabilite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

import sn.com.douane.ejb.rc.exception.RcEjbException;

/** @modelguid {61894673-A212-40EA-8281-EC9D70EEBF0C} */
public class TwrXmlFactory {

	private static final Log log = LogFactory.getLog(TwrXmlFactory.class);
	/** @modelguid {338D627F-8789-4BEF-A806-E3820F9AFA76} */
	public static String getAttributeValue(Document document, String itemName) {
		if ((document == null) || (itemName == null)){
			return null;
		}
//		String value = document.getAttributes().getNamedItem(itemName)
//				.getNodeValue();
//		if ((value == null) || (value.equals(""))) {
//			//document.get
//		}
		return "";
	}

	/** @modelguid {B2776A62-C097-4B0B-A96C-F2A0F7AF3982} */
	public static String getAttribute(Element element, String tagName) {
		if ((element == null) || (tagName == null)){
			return null;
		}
		String value = element.getAttribute(tagName);
		if ((value == null) || (value.equals(""))) {
			NodeList list = element.getElementsByTagName(tagName);
			for (int i = 0, max = list.getLength(); i < max; i++) {
				Node textNode = list.item(i);
				Node firstChild = list.item(0).getFirstChild();
				if (firstChild != null) {
					String auxValue = firstChild.getNodeValue();
					if ((auxValue != null)
							&& textNode.getParentNode().equals(element)) {
						value = auxValue;
						break;
					}
				}
			}
		}
		return value;
	}

	/** @modelguid {65CA5824-4D5F-4DA5-8E93-90EBB1AA83A9} */
	public static int getIntAttribute(Element element, String tagName) {
		try {
			return Integer.parseInt(getAttribute(element, tagName));
		} catch (NumberFormatException nfe) {
		}
		return 0;
	}

	/** @modelguid {8474C060-FA01-4E5C-8B1C-07F8026D879C} */
	public static NodeList getChildrenByTagName(Element element, String tagName) {
		if ((element == null) || (tagName == null)){
			return null;
		}
		List v = new ArrayList();

		NodeList children = element.getChildNodes();
		for (int i = 0, max = children.getLength(); i < max; i++) {
			if ((children.item(i) instanceof Element)
					&& tagName
							.equals(((Element) children.item(i)).getTagName())){
				v.add(children.item(i));
			}
		}

		return createNodeList(v);
	}

	/** @modelguid {41D6C54A-86CC-4A30-A437-7E0316CBC68A} */
	public static NodeList createNodeList(final List nodes) {
		if (nodes == null){
			return null;
		}
		NodeList nodeList = new NodeList() {
			/**
			 * @see NodeList#getLength()
			 */
			public int getLength() {
				return nodes.size();
			}

			/**
			 * @see NodeList#item(int)
			 */
			public Node item(int index) {
				return (Node) nodes.get(index);
			}
		};

		return nodeList;
	}

	public static Document getXmlDom(String xmlFilePath) throws RcEjbException {
		Document doc = null;
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			docBuilderFactory.setIgnoringComments(true);
			docBuilderFactory.setValidating(true);
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			final File xmlFile = new File(xmlFilePath.trim());
			if (!xmlFile.exists()) {
				throw new RcEjbException("fichier xml inexistant");
			}
			docBuilder.setErrorHandler(createErrorHandler(false));
			doc = docBuilder.parse(xmlFile);
			return (doc);
		} catch (Exception e) {
			throw new RcEjbException(e.getMessage());
		}

		//return null;
	}

	/** @modelguid {1B86A044-7705-472E-B3A1-E930248DC7B1} */
	private static ErrorHandler createErrorHandler(final boolean logMessages) {
		ErrorHandler errorHandler = new ErrorHandler() {
			public void error(SAXParseException exception) {
				log.error(exception.getMessage(),exception);
			}

			public void fatalError(SAXParseException exception) {
				log.error(exception.getMessage(),exception);
			}

			public void warning(SAXParseException exception) {
				log.error(exception.getMessage(),exception);
			}
		};

		return errorHandler;
	}

	/*
	 * UTILITAIRES POUR LA CREATION D'UN FICHIER XML SELON UN ORDRE BIEN DEFINI
	 * @modelguid {C4D779DC-5564-4D4D-8BC7-B8A09AC3E9BB}
	 */
//	public void nouvFile(String s, String ext) throws Exception {
//
//		try {
//			if ((s == null) || (s.equals(""))) {
//			} else {
//				File fichier = new File(s);
//			}
//			//parseXML parsexml= new parseXML(s);
//
//		} catch (Exception e) {
//			//System.out.println("MESSAGE ERREUR" + e.toString());
//		}
//
//	}

}