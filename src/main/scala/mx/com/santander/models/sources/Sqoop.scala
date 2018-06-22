package mx.com.santander.models

import mx.com.santander.service.serviceImpl.ExportOracleHDFS

object Sqoop {

  val emptyReg: Sqoop = new Sqoop("\\|" * 11)

  def apply(row: String): Option[Sqoop] = {
    try {
      Some(new Sqoop(row))
    }
    catch {
      case e1: IllegalArgumentException =>
        println(e1.getMessage)
        None
      case e2:NoSuchElementException=>
        println(e2.getMessage)
        None
    }
  }

}

class Sqoop private(row: String) extends  ExportOracleHDFS{

  var fields: Array[String] = splitRowPipe(row)
  require(fields.length == 11, "Número de atributos incorrecto (" + fields.length + "/11). Detalles:\n" + row)

  val connect: String = fields(0)
  val username: String = fields(1)
  val password: String = fields(2)
  val table: String = fields(3)
  val columns: String = fields(4)
  val compress: String = fields(5)
  val mapColumnHive: String = fields(6)
  val warehouseDir: String = fields(7)
  val splitBy: String = fields(8)
  val hiveImport: String = fields(9)
  val numberMappers: String = fields(10)

}
