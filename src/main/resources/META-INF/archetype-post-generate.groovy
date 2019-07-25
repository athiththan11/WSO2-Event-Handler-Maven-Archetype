import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

if(!"y".equals(request.properties['IdentityConnectorConfig'].toLowerCase())) {

    // retrive source directory
    Path srcDir = Paths.get(request.outputDirectory, request.artifactId, 'src/main/java', request.packageName.replace(".", "/"))

    // delete ServiceDataHolder component
    Path serviceDataHolder = srcDir.resolve("internal/CustomEventHandlerServiceDataHolder.java")
    Files.deleteIfExists serviceDataHolder

    // delete exception directory
    def exceptionDir = new File(srcDir.toString() + '/exception')
    exceptionDir.deleteDir()

    // delete constant directory
    def constantDir = new File(srcDir.toString() + '/constant')
    constantDir.deleteDir()
}