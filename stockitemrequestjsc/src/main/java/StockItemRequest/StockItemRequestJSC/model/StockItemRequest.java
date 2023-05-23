package StockItemRequest.StockItemRequestJSC.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;


@Data
@Entity
public class StockItemRequest {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    private Long id;
    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_id")
    private String employeeId;

    private String item;

    private int quantity;

    private String status;

    // getters and setters

}
