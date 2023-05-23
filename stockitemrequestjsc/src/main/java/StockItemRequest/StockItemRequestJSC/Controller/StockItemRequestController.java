package StockItemRequest.StockItemRequestJSC.Controller;



import StockItemRequest.StockItemRequestJSC.Service.StockItemRequestService;
import StockItemRequest.StockItemRequestJSC.model.StockItemRequest;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.amqp.rabbit.support.micrometer.RabbitMessageReceiverContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/stockitemrequest")
public class StockItemRequestController {




    @Autowired
    private StockItemRequestService stockItemRequestService;



    @GetMapping("/{stockitemrequestId}")
    public ResponseEntity<StockItemRequest> getStockitemrequestById(@PathVariable Long stockitemrequestId,@RequestParam("message")String message) {



        StockItemRequest stockItemRequest = stockItemRequestService.getStockItemRequestId(stockitemrequestId);

        return ResponseEntity.ok(stockItemRequest);
    }



    @PostMapping("/add")
    public ResponseEntity<StockItemRequest> createProduct(@RequestBody StockItemRequest stockItemRequest){

        StockItemRequest createStockItemRequest =  stockItemRequestService.createStockItemRequest(stockItemRequest);
        return new ResponseEntity<>(createStockItemRequest, HttpStatus.OK);
    }

    @PutMapping("/{stockitemrequestId}")
    public ResponseEntity<StockItemRequest> updateStockItemRequest(@PathVariable Long stockitemrequestId, @RequestBody StockItemRequest stockItemRequest) {
        StockItemRequest updatedstockitemrequest = stockItemRequestService.updateStockItemRequest( stockItemRequest);
        return ResponseEntity.ok(updatedstockitemrequest);


           }

    @DeleteMapping("/{stockitemrequestId}")
    public ResponseEntity<Void> deletestockitemrequest(@PathVariable Long stockitemrequestId) {
        stockItemRequestService.deleteStockItemRequest(stockitemrequestId);
        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public ResponseEntity<List<StockItemRequest>> getAllStockitemrequest() {
        List<StockItemRequest>  stockItemRequests = stockItemRequestService.getAllStockItemRequest();
        return ResponseEntity.ok(stockItemRequests);
    }


}
