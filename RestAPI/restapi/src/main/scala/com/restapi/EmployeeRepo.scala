package com.restapi
import cats.effect.IO
import com.restapi.EmployeeModel.Id

import scala.collection.mutable.HashMap
object EmployeeRepo {

  class Impl extends EmployeeTrait {
    val storage = HashMap[Id, Employee]().empty

    override def addEmployee(employee: Employee): IO[EmployeeModel.Id] = IO {
      val id = Id()
      storage.put(id, employee)
      id
    }

    override def getEmployee(oracleid: EmployeeModel.Id): IO[Option[EmployeeWithId]] = IO {
      storage.get(oracleid).map(employee => EmployeeWithId(oracleid.value, employee.name, employee.company))
    }

    override def getEmployees(): IO[List[EmployeeWithId]] = IO {
      storage.map { case (oracleid, employee) => EmployeeWithId(oracleid.value, employee.name, employee.company) }.toList
    }
  }
}
