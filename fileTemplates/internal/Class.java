#parse("File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("Log Import.java")
#parse("Java Header.java")
public class ${NAME} {
#parse("Log Code.java")
}
