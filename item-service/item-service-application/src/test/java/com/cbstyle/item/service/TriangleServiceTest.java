//package com.cbstyle.item.service;
//
//import com.cbstyle.item.model.State;
//import com.cbstyle.item.model.DressDto;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.concurrent.ThreadLocalRandom;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@TestPropertySource(locations = {"classpath:application-test.yml"})
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//public class TriangleServiceTest {
//
//    @Resource
//    private TriangleService triangleService;
//
//    @Test
//    public void shouldCreateAndRead() {
//        Integer adjacent = ThreadLocalRandom.current().nextInt(1, 1000);
//        Integer opposite = ThreadLocalRandom.current().nextInt(1, 1000);
//        DressDto triangleDto = DressDto.builder().adjacent(adjacent).opposite(opposite).state(State.PRE_CALC).build();
//        long id = triangleService.create(triangleDto);
//
//        DressDto triangleDtoResponse = triangleService.read(id);
//        Assert.assertNotNull(triangleDtoResponse);
//        Assert.assertEquals(triangleDto.getAdjacent(), triangleDtoResponse.getAdjacent());
//        Assert.assertEquals(triangleDto.getOpposite(), triangleDtoResponse.getOpposite());
//        Assert.assertEquals(triangleDto.getState(), triangleDtoResponse.getState());
//    }
//
//    @Test
//    public void shouldReadAll() {
//        Integer adjacent = ThreadLocalRandom.current().nextInt(1, 1000);
//        Integer opposite = ThreadLocalRandom.current().nextInt(1, 1000);
//        DressDto triangleDto1 = DressDto.builder().adjacent(adjacent).opposite(opposite).state(State.PRE_CALC).build();
//        long id1 = triangleService.create(triangleDto1);
//        DressDto triangleDto2 = DressDto.builder().adjacent(adjacent).opposite(opposite).state(State.PRE_CALC).build();
//        long id2 = triangleService.create(triangleDto2);
//
//        List<DressDto> triangleDtoListResponse = triangleService.readAll();
//        Assert.assertNotNull(triangleDtoListResponse);
//        Assert.assertEquals(2, triangleDtoListResponse.size());
//    }
//
//    @Test
//    public void shouldUpdate() {
//        Integer adjacent1 = ThreadLocalRandom.current().nextInt(1, 1000);
//        Integer opposite1 = ThreadLocalRandom.current().nextInt(1, 1000);
//        DressDto triangleDto1 = DressDto.builder().adjacent(adjacent1).opposite(opposite1).state(State.PRE_CALC).build();
//        long id = triangleService.create(triangleDto1);
//
//        DressDto triangleDtoResponse = triangleService.read(id);
//        Assert.assertNotNull(triangleDtoResponse);
//        Assert.assertEquals(triangleDto1.getAdjacent(), triangleDtoResponse.getAdjacent());
//        Assert.assertEquals(triangleDto1.getOpposite(), triangleDtoResponse.getOpposite());
//        Assert.assertEquals(triangleDto1.getState(), triangleDtoResponse.getState());
//
//        Integer adjacent2 = ThreadLocalRandom.current().nextInt(1, 1000);
//        Integer opposite2 = ThreadLocalRandom.current().nextInt(1, 1000);
//        DressDto triangleDto2 = DressDto.builder().adjacent(adjacent2).opposite(opposite2).state(State.POST_CALC).build();
//        triangleService.update(id, triangleDto2);
//
//        triangleDtoResponse = triangleService.read(id);
//        Assert.assertNotNull(triangleDtoResponse);
//        Assert.assertEquals(triangleDto2.getAdjacent(), triangleDtoResponse.getAdjacent());
//        Assert.assertEquals(triangleDto2.getOpposite(), triangleDtoResponse.getOpposite());
//        Assert.assertEquals(triangleDto2.getState(), triangleDtoResponse.getState());
//    }
//}