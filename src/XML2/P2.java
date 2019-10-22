package XML2;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class P2 {
	public static void main(String[] args) {
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			
			Element rootElement = doc.createElement("cursos");
			doc.appendChild(rootElement);
			
			
			//Curso 1 AMS2
			Element curs = doc.createElement("curs");
			rootElement.appendChild(curs);
			
			Attr attr = doc.createAttribute("id");
			attr.setValue("AMS1");
			curs.setAttributeNode(attr);
			
			Element tutor = doc.createElement("tutor");
			curs.appendChild(tutor);
			
			Element alumnes = doc.createElement("alumnes");
			curs.appendChild(alumnes);
			
			//Alumnos
			Element alumne = doc.createElement("alumne");
			alumne.appendChild(doc.createTextNode("ALVAREZ, Tomas"));
			alumnes.appendChild(alumne);
			
			Element alumne1 = doc.createElement("alumne");
			alumne1.appendChild(doc.createTextNode("CAMACHO, David"));
			alumnes.appendChild(alumne1);
			
			Element alumne2 = doc.createElement("alumne");
			alumne2.appendChild(doc.createTextNode("DE LA CRUZ, Sergio"));
			alumnes.appendChild(alumne2);
			
			Element alumne3 = doc.createElement("alumne");
			alumne3.appendChild(doc.createTextNode("DIAZ, Jose"));
			alumnes.appendChild(alumne3);
			
			Element alumne4 = doc.createElement("alumne");
			alumne4.appendChild(doc.createTextNode("DIAZ, Salvador"));
			alumnes.appendChild(alumne4);
			
			Element alumne5 = doc.createElement("alumne");
			alumne5.appendChild(doc.createTextNode("FERNANDEZ, Jose M"));
			alumnes.appendChild(alumne5);

			Element alumne6 = doc.createElement("alumne");
			alumne6.appendChild(doc.createTextNode("FERNANDEZ, Jose C"));
			alumnes.appendChild(alumne6);
			
			Element alumne7 = doc.createElement("alumne");
			alumne7.appendChild(doc.createTextNode("FERRANDIZ, Carlos"));
			alumnes.appendChild(alumne7);
			
			//Modulos1
			Element moduls = doc.createElement("moduls");
			curs.appendChild(moduls);
			
			Element modul = doc.createElement("modul");
			moduls.appendChild(modul);
			
			Attr attr1 = doc.createAttribute("id");
			attr1.setValue("M06");
			modul.setAttributeNode(attr1);
			
			//Hijos de modul
			Element titol = doc.createElement("titol");
			titol.appendChild(doc.createTextNode("Acces a dades"));
			modul.appendChild(titol);
			
			Element profes = doc.createElement("profes");
			modul.appendChild(profes);
			
			Element profe = doc.createElement("profe");
			profe.appendChild(doc.createTextNode("FUENTES, Julian"));
			profes.appendChild(profe);
			
			
			//UFS e hijos
			Element ufs = doc.createElement("ufs");
			modul.appendChild(ufs);
			
			Element uf1 = doc.createElement("uf");
			uf1.appendChild(doc.createTextNode("Persistencia en fitxers"));
			ufs.appendChild(uf1);
			
			Attr matr1 = doc.createAttribute("n");
			matr1.setValue("1");
			uf1.setAttributeNode(matr1);
			
			Element uf2 = doc.createElement("uf");
			uf2.appendChild(doc.createTextNode("Persistencia en BDR-BDOR-BDOO"));
			ufs.appendChild(uf2);
			
			Attr matr2 = doc.createAttribute("n");
			matr2.setValue("2");
			uf2.setAttributeNode(matr2);
			
			Element uf3 = doc.createElement("uf");
			uf3.appendChild(doc.createTextNode("Persistencia en BD natives XML"));
			ufs.appendChild(uf3);
			
			Attr matr3 = doc.createAttribute("n");
			matr3.setValue("3");
			uf3.setAttributeNode(matr3);
			
			Element uf4 = doc.createElement("uf");
			uf4.appendChild(doc.createTextNode("Components d'acces a dades"));
			ufs.appendChild(uf4);
			
			Attr matr4 = doc.createAttribute("n");
			matr4.setValue("4");
			uf4.setAttributeNode(matr4);
			
			
			
			
			
			
			
			
			
			
			
			
			//Curso2 AWS1
			Element curs2 = doc.createElement("curs");
			rootElement.appendChild(curs2);
			
			Attr attr2 = doc.createAttribute("id");
			attr2.setValue("AWS1");
			curs2.setAttributeNode(attr2);
			
			Element tutor2 = doc.createElement("tutor");
			tutor2.appendChild(doc.createTextNode("Julian Fuentes"));
			curs2.appendChild(tutor2);
			
			//Alumnos 2
			Element alumnes2 = doc.createElement("alumnes");
			curs2.appendChild(alumnes2);
			
			Element alumne20 = doc.createElement("alumne");
			alumne20.appendChild(doc.createTextNode("ABDELILLAH, Hicham"));
			alumnes2.appendChild(alumne20);
			
			Element alumne21 = doc.createElement("alumne");
			alumne21.appendChild(doc.createTextNode("FERNANDEZ, Ruben"));
			alumnes2.appendChild(alumne21);
			
			Element alumne22 = doc.createElement("alumne");
			alumne22.appendChild(doc.createTextNode("GARBETA, Giulio"));
			alumnes2.appendChild(alumne22);
			
			Element alumne23 = doc.createElement("alumne");
			alumne23.appendChild(doc.createTextNode("GARCIA, Miguel"));
			alumnes2.appendChild(alumne23);
			
			Element alumne24 = doc.createElement("alumne");
			alumne24.appendChild(doc.createTextNode("GARCIA, Elmer"));
			alumnes2.appendChild(alumne24);
			
			Element alumne25 = doc.createElement("alumne");
			alumne25.appendChild(doc.createTextNode("GONZALEZ, Victor M"));
			alumnes2.appendChild(alumne25);
			
			Element alumne26 = doc.createElement("alumne");
			alumne26.appendChild(doc.createTextNode("JANSSEN, Gerard"));
			alumnes2.appendChild(alumne26);
			
			Element alumne27 = doc.createElement("alumne");
			alumne27.appendChild(doc.createTextNode("LLOPART, Sergi"));
			alumnes2.appendChild(alumne27);
			
			
			
			//Modulos2
			Element moduls2 = doc.createElement("moduls");
			curs2.appendChild(moduls2);
			
			//Modulo 01
			Element modul1 = doc.createElement("modul");
			moduls2.appendChild(modul1);
			
			Attr m2attr1 = doc.createAttribute("id");
			m2attr1.setValue("M01");
			modul1.setAttributeNode(m2attr1);
			
			Element titol1 = doc.createElement("titol");
			titol1.appendChild(doc.createTextNode("Sistemes informatics"));
			modul1.appendChild(titol1);
			
			Element profes1 = doc.createElement("profes");
			modul1.appendChild(profes1);
			
			Element profe1 = doc.createElement("profe");
			profe1.appendChild(doc.createTextNode("FUENTES, Julian"));
			profes1.appendChild(profe1);
			
			Element profe2 = doc.createElement("profe");
			profe2.appendChild(doc.createTextNode("MESTRE, Manu"));
			profes1.appendChild(profe2);
			
			//UFS 2
			Element ufs1 = doc.createElement("ufs");
			modul1.appendChild(ufs1);
			
			Element uf11 = doc.createElement("uf");
			uf11.appendChild(doc.createTextNode("Instal.lacio, configuracio i explotacio d'un SI"));
			ufs1.appendChild(uf11);
			
			Attr attruf1 = doc.createAttribute("n");
			attruf1.setValue("1");
			uf11.setAttributeNode(attruf1);
			
			Element uf12 = doc.createElement("uf");
			uf12.appendChild(doc.createTextNode("Gestio de la informacio i de recursos en una xarxa"));
			ufs1.appendChild(uf12);
			
			Attr attruf2 = doc.createAttribute("n");
			attruf2.setValue("2");
			uf12.setAttributeNode(attruf2);
			
			Element uf13 = doc.createElement("uf");
			uf13.appendChild(doc.createTextNode("Implantacio de programari especific"));
			ufs1.appendChild(uf13);
			
			Attr attruf3 = doc.createAttribute("n");
			attruf3.setValue("3");
			uf13.setAttributeNode(attruf3);
			
			
			//Modulo 02
			Element modul2 = doc.createElement("modul");
			moduls2.appendChild(modul2);
			
			Attr m2attr2 = doc.createAttribute("id");
			m2attr2.setValue("M04");
			modul2.setAttributeNode(m2attr2);
			
			Element titol2 = doc.createElement("titol");
			titol2.appendChild(doc.createTextNode("Llenguatge de marques i SSGGdI"));
			modul2.appendChild(titol2);
			
			Element profes2 = doc.createElement("profes");
			modul2.appendChild(profes2);
			
			Element profe3 = doc.createElement("profe");
			profe3.appendChild(doc.createTextNode("FUENTES, Julian"));
			profes2.appendChild(profe3);
			
			Element profe4 = doc.createElement("profe");
			profe4.appendChild(doc.createTextNode("VILAPLANA, Angel"));
			profes2.appendChild(profe4);
			
			
			//UFS 3
			Element ufs2 = doc.createElement("ufs");
			modul2.appendChild(ufs2);
			
			Element uf14 = doc.createElement("uf");
			uf14.appendChild(doc.createTextNode("Programacio amb XML"));
			ufs2.appendChild(uf14);
			
			Attr attruf4 = doc.createAttribute("n");
			attruf4.setValue("1");
			uf14.setAttributeNode(attruf4);
			
			Element uf15 = doc.createElement("uf");
			uf15.appendChild(doc.createTextNode("Ambits d'aplicacio de XML"));
			ufs2.appendChild(uf15);
			
			Attr attruf5 = doc.createAttribute("n");
			attruf5.setValue("2");
			uf15.setAttributeNode(attruf5);
			
			Element uf16 = doc.createElement("uf");
			uf16.appendChild(doc.createTextNode("Sistemes de gestio empresarial"));
			ufs2.appendChild(uf16);
			
			Attr attruf6 = doc.createAttribute("n");
			attruf6.setValue("3");
			uf16.setAttributeNode(attruf6);
			
			
			//Modulo 03
			Element modul3 = doc.createElement("modul");
			moduls2.appendChild(modul3);
			
			Attr m2attr3 = doc.createAttribute("id");
			m2attr3.setValue("M05");
			modul3.setAttributeNode(m2attr3);
			
			Element titol3 = doc.createElement("titol");
			titol3.appendChild(doc.createTextNode("Entorns de desenvolupament"));
			modul3.appendChild(titol3);
			
			Element profes3 = doc.createElement("profes");
			modul3.appendChild(profes3);
			
			Element profe5 = doc.createElement("profe");
			profe5.appendChild(doc.createTextNode("FUENTES, Julian"));
			profes3.appendChild(profe5);
			
			Element profe6 = doc.createElement("profe");
			profe6.appendChild(doc.createTextNode("VILAPLANA, Angel"));
			profes3.appendChild(profe6);
			
			//UFS 3
			Element ufs3 = doc.createElement("ufs");
			modul3.appendChild(ufs3);
			
			Element uf17 = doc.createElement("uf");
			uf17.appendChild(doc.createTextNode("Desenvolupament de programari"));
			ufs3.appendChild(uf17);
			
			Attr attruf7 = doc.createAttribute("n");
			attruf7.setValue("1");
			uf17.setAttributeNode(attruf7);
			
			Element uf18 = doc.createElement("uf");
			uf18.appendChild(doc.createTextNode("Optimitzacio de programari"));
			ufs3.appendChild(uf18);
			
			Attr attruf8 = doc.createAttribute("n");
			attruf8.setValue("2");
			uf18.setAttributeNode(attruf8);
			
			Element uf19 = doc.createElement("uf");
			uf19.appendChild(doc.createTextNode("Introduccio al disseny orientat a objectes"));
			ufs3.appendChild(uf19);
			
			Attr attruf9 = doc.createAttribute("n");
			attruf9.setValue("3");
			uf19.setAttributeNode(attruf9);
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("Cursos.xml"));
			transformer.transform(source, result);

			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}

}
