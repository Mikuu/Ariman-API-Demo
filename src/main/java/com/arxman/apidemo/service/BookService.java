package com.arxman.apidemo.service;

//import com.arxman.vcer.slave.entities.Book;
//import com.arxman.vcer.slave.entities.TestCaseStatus;
//import com.arxman.vcer.slave.magick.MagickWorker;
//import com.arxman.vcer.slave.repository.IBookRepository;
//import com.arxman.vcer.slave.util.FakeUID;
import com.arxman.apidemo.entities.Book;
import com.arxman.apidemo.repository.IBookRepository;
import com.arxman.apidemo.util.FakeUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final Logger logger = LoggerFactory.getLogger(BookService.class);
    private final String bookIdPrefix = "BID";

    @Autowired
    private IBookRepository bookRepository;

    public String insertBook(String name, String author) {

        String bid = this.bookIdPrefix +FakeUID.getFakeUUID();

        Book book = new Book(bid, name, author, true);
        bookRepository.save(book);

        return book.getBid();
    }

//    public void updateTestCaseStatus(String uuid, TestCaseStatus testCaseStatus) {
//
//        Book testCase = slaveRepository.findByUuid(uuid);
//        testCase.setTestCaseStatus(testCaseStatus);
//
//        slaveRepository.save(testCase);
//    }
//
//    public void updateTestCaseResult(String uuid, String diffOutput, String diffValue, String imagePathDiff, byte[] imageDiff) {
//        Book testCase = slaveRepository.findByUuid(uuid);
//        testCase.setDiffOutput(diffOutput);
//        testCase.setDiffValue(diffValue);
//        testCase.setImageDiff(imageDiff);
//        testCase.setImagePathDiff(imagePathDiff);
//
//        testCase.setTestCaseStatus(TestCaseStatus.READY);
//
//        slaveRepository.save(testCase);
//    }
//
//    public byte[] getDiffImage(String uuid) {
//        Book testCase = slaveRepository.findByUuid(uuid);
//        return testCase.getImageDiff();
//    }
//
//    public Book getTestCase(String uuid) {
//        return slaveRepository.findByUuid(uuid);
//    }
//
//    public void deleteAllCompletedTestCases() {
//        int deletedCaseNumber = slaveRepository.deleteByTestCaseStatus(TestCaseStatus.COMPLETED);
//        logger.info("FBI --> " + String.valueOf(deletedCaseNumber) + " COMPLETED cases are deleted: ");
//
//    }
//
//    /**
//     * Delete Book by UUID / CompareID.
//     *
//     * @param uuid uuid, the same as compareId.
//     * */
//    public void deleteTestCase(String uuid) {
//        if (slaveRepository.deleteByUuid(uuid) > 0) {
//            logger.info("FBI --> deleted test case "+uuid);
//        } else {
//            logger.error("FBI --> deleted test case {} failed", uuid);
//        }
//    }

}
