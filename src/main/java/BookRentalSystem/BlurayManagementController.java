package BookRentalSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

 @RestController
 public class BlurayManagementController {
  @Autowired
  BlurayManagementRepository blurayManagementRepository;

  @PostMapping("/register")
  public BlurayRegistered registered(@RequestBody BlurayRegistered blurayRegistered)
  {
    BlurayManagement blurayManagement = new BlurayManagement();
    blurayManagement.setBlurayName(blurayRegistered.getBlurayName());
    blurayManagement.setRentalFee(blurayRegistered.getRentalFee());
    blurayManagement.setRegTime(new Date());
    blurayManagementRepository.save(blurayManagement);
    return blurayRegistered;
  }

 }
