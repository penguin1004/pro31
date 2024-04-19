package com.bookshop01.goods.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.bookshop01.goods.vo.ProductVO;
import com.bookshop01.goods.vo.ImageFileVO;

public interface GoodsDAO {
	public List<ProductVO> selectGoodsList(String goodsStatus ) throws DataAccessException;
	public List<String> selectKeywordSearch(String keyword) throws DataAccessException;
	public ProductVO selectGoodsDetail(String goods_id) throws DataAccessException;
	public List<ImageFileVO> selectGoodsDetailImage(String goods_id) throws DataAccessException;
	public List<ProductVO> selectGoodsBySearchWord(String searchWord) throws DataAccessException;
}
