package StockItemRequest.StockItemRequestJSC.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StockItemRequestJSC {

    private Long id;
    private String requestingDepartment;
    private Integer productCode;
    private String departmentCode;
    private String purposeOfIssue;
    private String  itemDescription;
    private Date dateOfPreviousIssue;
    private Integer  previusIssueQuatinty;
    private  Integer estimatedValue;

    private Integer quantity;


}
