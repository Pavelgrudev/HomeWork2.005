package pro.sky.HomeWork25.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import pro.sky.HomeWork25.model.Employee;
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedException extends RuntimeException{

    public EmployeeAlreadyAddedException(Employee employee){
        super("Такой сотрудник уже существует " + employee.toString());
    }
}
