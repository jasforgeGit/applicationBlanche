mvn tomcathot:undeployhot compile war:exploded tomcathot:deployhot -Dmaven.tomcat.url=http://localhost:8080/manager/text -Dtomcat.webapps.name=gainde -e