package top.putop.mi.db.dao;

import top.putop.mi.db.model.OdsTbOrder;

public interface OdsTbOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_tb_order
     *
     * @mbg.generated Fri Sep 04 12:19:43 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_tb_order
     *
     * @mbg.generated Fri Sep 04 12:19:43 CST 2020
     */
    int insert(OdsTbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_tb_order
     *
     * @mbg.generated Fri Sep 04 12:19:43 CST 2020
     */
    int insertSelective(OdsTbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_tb_order
     *
     * @mbg.generated Fri Sep 04 12:19:43 CST 2020
     */
    OdsTbOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_tb_order
     *
     * @mbg.generated Fri Sep 04 12:19:43 CST 2020
     */
    int updateByPrimaryKeySelective(OdsTbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_tb_order
     *
     * @mbg.generated Fri Sep 04 12:19:43 CST 2020
     */
    int updateByPrimaryKey(OdsTbOrder record);
}