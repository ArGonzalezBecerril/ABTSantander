package mx.com.santander.models.sources

import java.io.FileInputStream

import org.junit.Test
import java.util.Properties

@Test
class SqoopTest {
  private val path = System.getProperty("user.dir")

 @Test
 def infoIsComplete(): Unit = {
   try{
       val prop = new Properties()
       prop.load(new FileInputStream(path + "/src/test/resources/sources/cdd_maestra_demograficos_yyyymm.properties"))
       val connect = prop.getProperty("CONNECT")
       println(connect)
   } catch {
     case e : Exception =>
          e.printStackTrace()
          sys.exit(1)
   }

 }

 @Test
 def connectionTest(): Unit = {

 }

}
