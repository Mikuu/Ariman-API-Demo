package com.arxman.apidemo.controller;

//import com.arxman.vcer.slave.entities.Book;
//import com.arxman.vcer.slave.magick.MagickWorker;
//import com.arxman.vcer.slave.rest.dto.response.CompareResponseDTO;
//import com.arxman.vcer.slave.rest.dto.response.RetrieveResponseDTO;
//import com.arxman.vcer.slave.service.SlaveService;
//import com.arxman.vcer.slave.service.StorageService;
//import com.arxman.vcer.slave.util.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlaveController {

//    private final Logger logger = LoggerFactory.getLogger(SlaveController.class);
//    private MagickWorker magickWorker = new MagickWorker();
//
//    @Autowired
//    private Timer timer;
//
//    @Autowired
//    private SlaveService slaveService;
//
//    @Autowired
//    private StorageService storageService;
//
//    @PostMapping("/compare")
//    public CompareResponseDTO compare(@RequestParam("imageAIid") String imageAIid,
//                                      @RequestParam("imageBIid") String imageBIid) {
//
//        logger.info("FBI --> Got image {} and image {} to compare", imageAIid, imageBIid);
//        StorageService.ImageFile imageA = storageService.downloadImageFile(imageAIid);
//        StorageService.ImageFile imageB = storageService.downloadImageFile(imageBIid);
//
//        String uuid = slaveService.initialTestCase(
//                        imageA.getFileContent(), imageA.getFilename(),
//                        imageB.getFileContent(), imageB.getFilename()
//        );
//
//        return new CompareResponseDTO(uuid);
//    }
//
//    @GetMapping("/retrieve")
//    public RetrieveResponseDTO retrieve(@RequestParam("compareId") String compareId) {
//        String uuid = compareId;
//        Book testCase = slaveService.getTestCase(uuid);
//
//        RetrieveResponseDTO responseDTO = new RetrieveResponseDTO();
//        responseDTO.setCompareId(compareId);
//        responseDTO.setDiffFilename(testCase.getDiffFilename());
//        responseDTO.setDiffIid(testCase.getDiffIid());
//        responseDTO.setDiffOutput(testCase.getDiffOutput());
//        responseDTO.setDiffValue(testCase.getDiffValue());
//
//        return responseDTO;
//    }
}