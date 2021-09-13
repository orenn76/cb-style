//package com.cbstyle.item.repository;
//
//import com.cbstyle.item.model.State;
//import com.cbstyle.item.model.Triangle;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.concurrent.ThreadLocalRandom;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@TestPropertySource(locations = {"classpath:application-test.yml"})
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//public class TriangleRepositoryTest {
//
//    @Resource
//    private TriangleRepository triangleRepository;
//
//    @Test
//    public void shouldAddAndFindTriangle() {
//        Integer adjacent = ThreadLocalRandom.current().nextInt(1, 1000);
//        Integer opposite = ThreadLocalRandom.current().nextInt(1, 1000);
//        Triangle triangle = new Triangle();
//        triangle.setAdjacent(adjacent);
//        triangle.setOpposite(opposite);
//        triangle.setState(State.PRE_CALC);
//        triangle = triangleRepository.save(triangle);
//
//        Triangle triangleResponse = triangleRepository.findOne(triangle.getId());
//        Assert.assertNotNull(triangleResponse);
//        Assert.assertEquals(triangle.getAdjacent(), triangleResponse.getAdjacent());
//        Assert.assertEquals(triangle.getOpposite(), triangleResponse.getOpposite());
//        Assert.assertEquals(triangle.getState(), triangleResponse.getState());
//    }
//
//}