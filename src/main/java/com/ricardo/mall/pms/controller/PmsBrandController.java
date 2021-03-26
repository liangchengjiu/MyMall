package com.ricardo.mall.pms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ricardo.mall.common.PageBean;
import com.ricardo.mall.common.ResultBean;
import com.ricardo.mall.pms.entity.PmsBrand;
import com.ricardo.mall.pms.service.PmsBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author Dawson·Ricardo
 * @since 2021-03-26
 */
@RestController
@RequestMapping("/pmsBrand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public ResultBean<List<PmsBrand>> getBrandList() {
        return ResultBean.success(pmsBrandService.list());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResultBean createBrand(@RequestBody PmsBrand pmsBrand) {
        ResultBean resultBean;
        boolean save = pmsBrandService.save(pmsBrand);
        if (save) {
            resultBean = ResultBean.success(pmsBrand);
            LOGGER.debug("createBrand success:{}", pmsBrand);
        } else {
            resultBean = ResultBean.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", pmsBrand);
        }
        return resultBean;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResultBean updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand pmsBrandDto, BindingResult result) {
        ResultBean resultBean;
        pmsBrandDto.setId(id);
        boolean updateById = pmsBrandService.updateById(pmsBrandDto);
        if (updateById) {
            resultBean = ResultBean.success(pmsBrandDto);
            LOGGER.debug("updateBrand success:{}", pmsBrandDto);
        } else {
            resultBean = ResultBean.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", pmsBrandDto);
        }
        return resultBean;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ResultBean deleteBrand(@PathVariable("id") Long id) {
        boolean b = pmsBrandService.removeById(id);
        if (b) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return ResultBean.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return ResultBean.failed("操作失败");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultBean<PageBean<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,

                                                    @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        Page page = new Page();
        page.setCurrent(pageNum);
        page.setSize(pageSize);
        PageBean pageBean = new PageBean(pmsBrandService.page(page));
        return ResultBean.success(pageBean);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResultBean<PmsBrand> brand(@PathVariable("id") Long id) {
        return ResultBean.success(pmsBrandService.getById(id));
    }
}
