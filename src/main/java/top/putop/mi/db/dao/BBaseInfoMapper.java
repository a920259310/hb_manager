package top.putop.mi.db.dao;

import top.putop.mi.db.model.BBaseInfo;

public interface BBaseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_base_info
     *
     * @mbg.generated Sat Sep 05 12:03:12 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_base_info
     *
     * @mbg.generated Sat Sep 05 12:03:12 CST 2020
     */
    int insert(BBaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_base_info
     *
     * @mbg.generated Sat Sep 05 12:03:12 CST 2020
     */
    int insertSelective(BBaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_base_info
     *
     * @mbg.generated Sat Sep 05 12:03:12 CST 2020
     */
    BBaseInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_base_info
     *
     * @mbg.generated Sat Sep 05 12:03:12 CST 2020
     */
    int updateByPrimaryKeySelective(BBaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_base_info
     *
     * @mbg.generated Sat Sep 05 12:03:12 CST 2020
     */
    int updateByPrimaryKey(BBaseInfo record);
}