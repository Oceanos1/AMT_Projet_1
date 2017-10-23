FROM jboss/wildfly:10.1.0.Final

MAINTAINER Edward Ransome <edward.ransome@heig-vd.ch>


COPY data/mysql-connector-java-5.1.39.jar /opt/jboss/wildfly/standalone/deployments
COPY data/standalone.xml /opt/jboss/wildfly/standalone/configuration/
COPY data/programs.war /opt/jboss/wildfly/standalone/autodeploy
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

