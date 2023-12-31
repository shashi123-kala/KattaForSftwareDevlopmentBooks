package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sdb.entity.SoftwareDevelopmentBook;

public class CalculateDiscountTest {
	CalculateDiscount calculateDiscount = new CalculateDiscount();

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<>();
		double discount = 0.0;
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		sdbList.add(sdbFirstI);
		assertEquals(50.0, calculateDiscount.getTotalPrice(discount, sdbList));
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<>();
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		double discount = 5;
		sdbList.add(sdbFirstI);
		sdbList.add(sdbSecI);
		assertEquals(95.0, calculateDiscount.getTotalPrice(discount, sdbList));
	}

	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<>();
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		double discount = 10;
		sdbList.add(sdbFirstI);
		sdbList.add(sdbSecI);
		sdbList.add(sdbThirdI);
		assertEquals(135.0, calculateDiscount.getTotalPrice(discount, sdbList));

	}

}
