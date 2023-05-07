package pro.sky.HomeWork25.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import pro.sky.HomeWork25.model.Employee;
@ResponseStatus (code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
  public EmployeeNotFoundException(Employee employee) {
     super("Сотрудник не найден "  + employee.toString());

  }




}
