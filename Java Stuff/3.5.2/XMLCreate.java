
/**
 * ICS4U0 Computer Science, Grade 12
 * @fileame XMLCreate.java
 * @author Ajinkya
 * @date October 24, 2020
 * @version 1.0
 * @Description: A program that writes course information to a xml file. 
 * Then it adds the element "schoolBoard" to contain the name of my school board
 * and changes the element "teacher" from "Teacher A" to the name of my teacher.
 * Finally,it  prints the entire XML to the screen.
 */


import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.*;


public class XMLCreate {
    public static void writeFile(String filepath){
        try{
            // creates the new file to be written to, and then defines it to be
            // XML with the ISO 8859_1 encoding style.
            OutputStream fout= new FileOutputStream(filepath);
            OutputStream bout= new BufferedOutputStream(fout);
            OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
           
            
            // writing course information to the xml file
            out.write("<?xml version=\"1.0\" ");
            out.write("encoding=\"ISO-8859-1\"?>\r\n");
            
            out.write("<class>\r\n");
            
            out.write("<course>\r\n");
            out.write("<code> ICS4U0 </code>\r\n");
            out.write("<description> Computer Programming, Grade 12, University</description>\r\n");
            out.write("<teacher>Teacher A </teacher>\r\n");
            out.write("<fileType>Unmodified</fileType>\r\n");
            out.write("</course> \r\n");

            out.write("<course>\r\n");
            out.write("<code> ENG4U0 </code>\r\n");
            out.write("<description> English, Grade 12, University</description>\r\n");
            out.write("<teacher>Mr Luchak </teacher>\r\n");
            out.write("<fileType>Unmodified</fileType>\r\n");
            out.write("</course> \r\n");
            
            out.write("<course>\r\n");
            out.write("<code> TEJ4M0 </code>\r\n");
            out.write("<description> Computer Engineering, Grade 12, Mixed</description>\r\n");
            out.write("<teacher>Mr Rustja </teacher>\r\n");
            out.write("<fileType>Unmodified</fileType>\r\n");
            out.write("</course> \r\n");
            
            out.write("</class>\r\n");
            
            
            out.flush();  // Don't forget to flush!
            out.close();
        }catch (UnsupportedEncodingException e) {
            System.out.println("This VM does not support the Latin-1 character set.");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    
    
    public static void modifyPrintFile(String filepath){
        try{
            // Modifying xml file
            
            
            // Using DOM functionalities to modify the xml file
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);


            // Finding the number of course tags in the xml file
            NodeList listOfCourses = doc.getElementsByTagName("course");
            int totalCourses = listOfCourses.getLength();


            // Adding schoolBoard node to each coure by iterating though each course
            for(int i = 0; i < totalCourses; i++){

                // Get the course element by tag name directly
                Node Course = doc.getElementsByTagName("course").item(i);


                // appends a new node("schoolBoard") to i-th course
                Element schoolBoard = doc.createElement("schoolBoard");
                schoolBoard.appendChild(doc.createTextNode("Peel District School Board"));
                Course.appendChild(schoolBoard);
            }


            // change the name of the first teacher(Teacher A --> Mr So)
            Node teacherName = doc.getElementsByTagName("teacher").item(0);
            teacherName.setTextContent("Mr So");


            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result =  new StreamResult(new File(filepath));
            transformer.transform(source, result);
            
            
            
            // Printing/Displaying xml file
            
            System.out.println("Total number of courses: "+ totalCourses);

            
            for (int s = 0; s<listOfCourses.getLength(); s++) {
                Node firstCourseNode = listOfCourses.item(s);
                
                if (firstCourseNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element firstCourseElement = (Element) firstCourseNode;
                    NodeList courseCodeList = firstCourseElement.getElementsByTagName("code");
                    Element courseCodeElement = (Element) courseCodeList.item(0);
                    NodeList textCodeList = courseCodeElement.getChildNodes();
                    System.out.println("\nCourse Code: " + ((Node)textCodeList.item(0)).getNodeValue().trim());
                    
                    NodeList courseDescriptionList = firstCourseElement.getElementsByTagName("description");
                    Element courseDescriptionElement = (Element)courseDescriptionList.item(0);
                    NodeList textDescriptionList = courseDescriptionElement.getChildNodes();
                    System.out.println("Description: " + ((Node)textDescriptionList.item(0)).getNodeValue().trim());
                    
                    NodeList teacherList = firstCourseElement.getElementsByTagName("teacher");
                    Element teacherElement = (Element)teacherList.item(0);
                    NodeList textTeacherList = teacherElement.getChildNodes();
                    System.out.println("Teacher: " + ((Node)textTeacherList.item(0)).getNodeValue().trim());
                    
                    NodeList schoolBoardList = firstCourseElement.getElementsByTagName("schoolBoard");
                    Element schoolBoardElement = (Element)schoolBoardList.item(0);
                    NodeList textSchoolBoardList = schoolBoardElement.getChildNodes();
                    System.out.println("School Board: " + ((Node)textSchoolBoardList.item(0)).getNodeValue().trim());
                }
            }
            
        }catch(ParserConfigurationException | TransformerException | IOException | SAXException pce){
            pce.printStackTrace();
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
    
    public static void main(String[] args) {
        try{
            String filepath = "information.xml";
            
            writeFile(filepath);
                        
            modifyPrintFile(filepath);
            
        }catch(Exception e){
            System.out.println("There Was An Unknown Error!");
        }
    }
}


