package com.bookshop01.goods.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop01.goods.dao.GoodsDAO;
import com.bookshop01.goods.vo.ProductVO;
import com.bookshop01.goods.vo.ImageFileVO;

@Service("goodsService")
@Transactional(propagation=Propagation.REQUIRED)
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDAO goodsDAO;
	
	public Map<String,List<ProductVO>> listGoods() throws Exception {
		Map<String,List<ProductVO>> goodsMap=new HashMap<String,List<ProductVO>>();
		List<ProductVO> goodsList=goodsDAO.selectGoodsList("bestseller");
		goodsMap.put("bestseller",goodsList);
		
		/*
		 * goodsList=goodsDAO.selectGoodsList("newbook");
		 * goodsMap.put("newbook",goodsList);
		 * 
		 * goodsList=goodsDAO.selectGoodsList("steadyseller");
		 * goodsMap.put("steadyseller",goodsList);
		 */
		
		return goodsMap;
	}
	
	public Map goodsDetail(String _goods_id) throws Exception {
		Map goodsMap=new HashMap();
		ProductVO goodsVO = goodsDAO.selectGoodsDetail(_goods_id);
		goodsMap.put("goodsVO", goodsVO);
		List<ImageFileVO> imageList =goodsDAO.selectGoodsDetailImage(_goods_id);
		goodsMap.put("imageList", imageList);
		return goodsMap;
	}
	
	public List<String> keywordSearch(String keyword) throws Exception {
		List<String> list=goodsDAO.selectKeywordSearch(keyword);
		return list;
	}
	
	public List<ProductVO> searchGoods(String searchWord) throws Exception{
		List goodsList=goodsDAO.selectGoodsBySearchWord(searchWord);
		return goodsList;
	}
	
	
}
