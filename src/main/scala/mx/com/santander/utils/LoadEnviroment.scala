package mx.com.santander.utils

import java.io.FileInputStream
import java.util.Properties

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object LoadEnviroment {

  private val path = System.getProperty("user.dir")
  val prop = new Properties()
  prop.load(new FileInputStream(path + "/src/test/resources/sources/cdd_maestra_demograficos_yyyymm.properties"))
  /** Obtener un Spark Session **/

 // val conf = new SparkConf()
 //     .setAppName("ATBSantander")
 //     .setMaster()
 // var contextSpark = SparkSession.builder.master("local[*]").appName("Example").getOrCreate()


}
