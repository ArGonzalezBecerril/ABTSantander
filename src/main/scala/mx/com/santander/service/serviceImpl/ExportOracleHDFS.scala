package mx.com.santander.service.serviceImpl

abstract class ExportOracleHDFS {

  protected def splitRowPipe(row: String): Array[String] = {
    row.split("\\|")
  }

}
