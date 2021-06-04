package top.putop.mi.spader.model;

import java.util.List;

/**
 * 历史价格数据模型
 */
public class OdsBbPriceHis {

    /**
     * data : {"data":{"openprice":11297.790569,"closedprice":10663.505274,"vol":1.70634602148935E10,"changecount":0,"changerate":-5.614241927447434,"high":11439.907602,"low":10558.332644,"high_week":12033.209918,"low_week":10121.038941,"high_month":12386.964733,"low_month":10121.038941,"high_3month":12386.964733,"low_3month":8955.82555,"high_his":20089,"low_his":65.5260009766,"high_his_time":"2017-12-16T16:00:00Z","low_his_time":"2013-07-04T16:00:00Z","price":10271.438031,"change":-634.285295,"fallrate_ath":-48.87},"list":[{"tickertime":"2020-09-03T00:00:00","openprice":11297.790569,"closeprice":10663.505274,"high":11439.907602,"low":10558.332644,"marketcap":1.97022389082E11,"vol":1.70634602148935E10,"changerate":-5.61},{"tickertime":"2020-09-02T00:00:00","openprice":11995.184811,"closeprice":11326.805943,"high":12033.209918,"low":11221.751503,"marketcap":2.09277747815E11,"vol":1.72986797810847E10,"changerate":-5.57},{"tickertime":"2020-09-01T00:00:00","openprice":11732.219493,"closeprice":12035.563761,"high":12014.179781,"low":11547.234085,"marketcap":2.22372987606E11,"vol":1.55804328145234E10,"changerate":2.59},{"tickertime":"2020-08-31T00:00:00","openprice":11591.234262,"closeprice":11734.265004,"high":11747.323334,"low":11568.166668,"marketcap":2.16743820106E11,"vol":1.21767412826017E10,"changerate":1.23},{"tickertime":"2020-08-30T00:00:00","openprice":11478.892232,"closeprice":11617.085905,"high":11649.046992,"low":11461.390446,"marketcap":2.14579402859E11,"vol":1.04278170874377E10,"changerate":1.2},{"tickertime":"2020-08-29T00:00:00","openprice":11503.371016,"closeprice":11497.89893,"high":11575.214922,"low":11432.9817,"marketcap":2.12377898098E11,"vol":9.8915872907027E9,"changerate":-0.05},{"tickertime":"2020-08-28T00:00:00","openprice":11312.843408,"closeprice":11525.523355,"high":11502.924472,"low":11180.194003,"marketcap":2.1288814935E11,"vol":1.09307090851479E10,"changerate":1.88},{"tickertime":"2020-08-27T00:00:00","openprice":11485.222164,"closeprice":11322.891471,"high":11551.695199,"low":11278.778577,"marketcap":2.09145332173E11,"vol":1.16193463084287E10,"changerate":-1.41},{"tickertime":"2020-08-26T00:00:00","openprice":11405.928216,"closeprice":11477.168467,"high":11479.734771,"low":11150.369308,"marketcap":2.11994985343E11,"vol":1.22784756247006E10,"changerate":0.62},{"tickertime":"2020-08-25T00:00:00","openprice":11745.864543,"closeprice":11419.1004,"high":11774.228499,"low":11349.478884,"marketcap":2.10850183222E11,"vol":1.12606638679401E10,"changerate":-2.78},{"tickertime":"2020-08-24T00:00:00","openprice":11638.139386,"closeprice":11752.047564,"high":11808.628684,"low":11597.759628,"marketcap":2.16997950391E11,"vol":9.7223845108191E9,"changerate":0.98},{"tickertime":"2020-08-23T00:00:00","openprice":11590.343699,"closeprice":11647.334182,"high":11677.138399,"low":11525.508676,"marketcap":2.15064449939E11,"vol":8.6200238319034E9,"changerate":0.49},{"tickertime":"2020-08-22T00:00:00","openprice":11708.783584,"closeprice":11593.412347,"high":11735.472297,"low":11393.708036,"marketcap":2.1406879981E11,"vol":1.19752845902967E10,"changerate":-0.99},{"tickertime":"2020-08-21T00:00:00","openprice":11832.761273,"closeprice":11710.459726,"high":11877.986219,"low":11657.347578,"marketcap":2.16230043729E11,"vol":1.19579966096398E10,"changerate":-1.03},{"tickertime":"2020-08-20T00:00:00","openprice":11768.505191,"closeprice":11843.758249,"high":11846.174255,"low":11628.426837,"marketcap":2.18691360034E11,"vol":1.05503616450345E10,"changerate":0.64},{"tickertime":"2020-08-19T00:00:00","openprice":11930.259982,"closeprice":11730.055816,"high":12075.254699,"low":11642.930458,"marketcap":2.16591879515E11,"vol":1.21651777104965E10,"changerate":-1.68},{"tickertime":"2020-08-18T00:00:00","openprice":12362.284675,"closeprice":11933.864128,"high":12381.170235,"low":11879.244988,"marketcap":2.20303081912E11,"vol":1.39884016452702E10,"changerate":-3.47},{"tickertime":"2020-08-17T00:00:00","openprice":11863.709333,"closeprice":12388.856172,"high":12386.964733,"low":11788.818494,"marketcap":2.28702385647E11,"vol":1.36810724563937E10,"changerate":4.43},{"tickertime":"2020-08-16T00:00:00","openprice":11880.122219,"closeprice":11850.387249,"high":11956.591168,"low":11700.819817,"marketcap":2.18762071095E11,"vol":1.1065948010005E10,"changerate":-0.25},{"tickertime":"2020-08-15T00:00:00","openprice":11700.297193,"closeprice":11836.253893,"high":11954.471776,"low":11700.297193,"marketcap":2.18501164665E11,"vol":1.18022875599521E10,"changerate":1.16},{"tickertime":"2020-08-14T00:00:00","openprice":11499.729983,"closeprice":11725.114561,"high":11817.444117,"low":11451.348621,"marketcap":2.16449495809E11,"vol":1.20613641318159E10,"changerate":1.96},{"tickertime":"2020-08-13T00:00:00","openprice":11597.217796,"closeprice":11494.531384,"high":11655.147067,"low":11306.528084,"marketcap":2.12093495309E11,"vol":1.11525658986406E10,"changerate":-0.89},{"tickertime":"2020-08-12T00:00:00","openprice":11487.143744,"closeprice":11584.171687,"high":11614.061189,"low":11200.870429,"marketcap":2.13747510123E11,"vol":1.29128791541784E10,"changerate":0.84},{"tickertime":"2020-08-11T00:00:00","openprice":11902.521339,"closeprice":11499.759934,"high":11934.356321,"low":11465.637722,"marketcap":2.12189970877E11,"vol":1.15577415072593E10,"changerate":-3.38},{"tickertime":"2020-08-10T00:00:00","openprice":11569.794121,"closeprice":11909.120773,"high":12034.435698,"low":11525.444578,"marketcap":2.19743368949E11,"vol":1.25660039356025E10,"changerate":2.93},{"tickertime":"2020-08-09T00:00:00","openprice":11740.312802,"closeprice":11563.021932,"high":11788.42936,"low":11552.477247,"marketcap":2.13357261463E11,"vol":8.8931927830804E9,"changerate":-1.51},{"tickertime":"2020-08-08T00:00:00","openprice":11662.923264,"closeprice":11736.975478,"high":11796.790814,"low":11384.860598,"marketcap":2.16566997847E11,"vol":9.4856378401923E9,"changerate":0.63},{"tickertime":"2020-08-07T00:00:00","openprice":11837.226896,"closeprice":11640.857896,"high":11889.469958,"low":11589.657736,"marketcap":2.14793466308E11,"vol":1.07290225296345E10,"changerate":-1.66},{"tickertime":"2020-08-06T00:00:00","openprice":11640.260677,"closeprice":11835.015847,"high":11867.990716,"low":11567.101871,"marketcap":2.18376008049E11,"vol":1.19691217895526E10,"changerate":1.67},{"tickertime":"2020-08-05T00:00:00","openprice":11224.993066,"closeprice":11642.563829,"high":11670.459385,"low":11120.798915,"marketcap":2.1482494365E11,"vol":1.10954455057086E10,"changerate":3.72}],"changeratekline":[{"year":2020,"list":[28.96,-6.71,-27.25,31.87,13.48,-3.75,20.61,5.58]},{"year":2019,"list":[-7.71,11.39,6.53,30.34,60.24,26.16,-11.33,0.4,-16.62,13.75,-14.42,-6.56]}],"highpricekline":[{"year":2020,"list":[9365.127453,10323.55903,9126.914929,8350.604904,9935.621248,9802.321337,11145.334603,12388.856172]},{"year":2019,"list":[4076.63268458,4142.52692999,4106.66008466,5572.36206051,8805.7783766,13016.2317442,12561.311306,11971.953791,10854.537999,9535.565051,9364.302392,7574.980106]},{"year":2018,"list":[17527,11403.7001953,11573.2998047,9697.5,9858.15039062,7720.25,8424.26953125,7624.91,7361.66,6652.23,6530.14,4214.67193177]},{"year":2017,"list":[1154.72998047,1179.9699707,1274.98999023,1347.89001465,2443.63989258,2958.11010742,2875.34008789,4703.39013672,4892.00976562,6468.39990234,10233.5996094,19497.4003906]},{"year":2016,"list":[458.04800415,438.79800415,435.12298584,466.088989258,533.864013672,766.307983398,703.702026367,606.271972656,626.315979004,714.479003906,751.616027832,975.921020508]}],"total_count":30,"total_pages":1,"page":1}
     * code : 200
     * msg : success
     */

    private DataBeanX data;
    private int code;
    private String msg;

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBeanX {
        /**
         * data : {"openprice":11297.790569,"closedprice":10663.505274,"vol":1.70634602148935E10,"changecount":0,"changerate":-5.614241927447434,"high":11439.907602,"low":10558.332644,"high_week":12033.209918,"low_week":10121.038941,"high_month":12386.964733,"low_month":10121.038941,"high_3month":12386.964733,"low_3month":8955.82555,"high_his":20089,"low_his":65.5260009766,"high_his_time":"2017-12-16T16:00:00Z","low_his_time":"2013-07-04T16:00:00Z","price":10271.438031,"change":-634.285295,"fallrate_ath":-48.87}
         * list : [{"tickertime":"2020-09-03T00:00:00","openprice":11297.790569,"closeprice":10663.505274,"high":11439.907602,"low":10558.332644,"marketcap":1.97022389082E11,"vol":1.70634602148935E10,"changerate":-5.61},{"tickertime":"2020-09-02T00:00:00","openprice":11995.184811,"closeprice":11326.805943,"high":12033.209918,"low":11221.751503,"marketcap":2.09277747815E11,"vol":1.72986797810847E10,"changerate":-5.57},{"tickertime":"2020-09-01T00:00:00","openprice":11732.219493,"closeprice":12035.563761,"high":12014.179781,"low":11547.234085,"marketcap":2.22372987606E11,"vol":1.55804328145234E10,"changerate":2.59},{"tickertime":"2020-08-31T00:00:00","openprice":11591.234262,"closeprice":11734.265004,"high":11747.323334,"low":11568.166668,"marketcap":2.16743820106E11,"vol":1.21767412826017E10,"changerate":1.23},{"tickertime":"2020-08-30T00:00:00","openprice":11478.892232,"closeprice":11617.085905,"high":11649.046992,"low":11461.390446,"marketcap":2.14579402859E11,"vol":1.04278170874377E10,"changerate":1.2},{"tickertime":"2020-08-29T00:00:00","openprice":11503.371016,"closeprice":11497.89893,"high":11575.214922,"low":11432.9817,"marketcap":2.12377898098E11,"vol":9.8915872907027E9,"changerate":-0.05},{"tickertime":"2020-08-28T00:00:00","openprice":11312.843408,"closeprice":11525.523355,"high":11502.924472,"low":11180.194003,"marketcap":2.1288814935E11,"vol":1.09307090851479E10,"changerate":1.88},{"tickertime":"2020-08-27T00:00:00","openprice":11485.222164,"closeprice":11322.891471,"high":11551.695199,"low":11278.778577,"marketcap":2.09145332173E11,"vol":1.16193463084287E10,"changerate":-1.41},{"tickertime":"2020-08-26T00:00:00","openprice":11405.928216,"closeprice":11477.168467,"high":11479.734771,"low":11150.369308,"marketcap":2.11994985343E11,"vol":1.22784756247006E10,"changerate":0.62},{"tickertime":"2020-08-25T00:00:00","openprice":11745.864543,"closeprice":11419.1004,"high":11774.228499,"low":11349.478884,"marketcap":2.10850183222E11,"vol":1.12606638679401E10,"changerate":-2.78},{"tickertime":"2020-08-24T00:00:00","openprice":11638.139386,"closeprice":11752.047564,"high":11808.628684,"low":11597.759628,"marketcap":2.16997950391E11,"vol":9.7223845108191E9,"changerate":0.98},{"tickertime":"2020-08-23T00:00:00","openprice":11590.343699,"closeprice":11647.334182,"high":11677.138399,"low":11525.508676,"marketcap":2.15064449939E11,"vol":8.6200238319034E9,"changerate":0.49},{"tickertime":"2020-08-22T00:00:00","openprice":11708.783584,"closeprice":11593.412347,"high":11735.472297,"low":11393.708036,"marketcap":2.1406879981E11,"vol":1.19752845902967E10,"changerate":-0.99},{"tickertime":"2020-08-21T00:00:00","openprice":11832.761273,"closeprice":11710.459726,"high":11877.986219,"low":11657.347578,"marketcap":2.16230043729E11,"vol":1.19579966096398E10,"changerate":-1.03},{"tickertime":"2020-08-20T00:00:00","openprice":11768.505191,"closeprice":11843.758249,"high":11846.174255,"low":11628.426837,"marketcap":2.18691360034E11,"vol":1.05503616450345E10,"changerate":0.64},{"tickertime":"2020-08-19T00:00:00","openprice":11930.259982,"closeprice":11730.055816,"high":12075.254699,"low":11642.930458,"marketcap":2.16591879515E11,"vol":1.21651777104965E10,"changerate":-1.68},{"tickertime":"2020-08-18T00:00:00","openprice":12362.284675,"closeprice":11933.864128,"high":12381.170235,"low":11879.244988,"marketcap":2.20303081912E11,"vol":1.39884016452702E10,"changerate":-3.47},{"tickertime":"2020-08-17T00:00:00","openprice":11863.709333,"closeprice":12388.856172,"high":12386.964733,"low":11788.818494,"marketcap":2.28702385647E11,"vol":1.36810724563937E10,"changerate":4.43},{"tickertime":"2020-08-16T00:00:00","openprice":11880.122219,"closeprice":11850.387249,"high":11956.591168,"low":11700.819817,"marketcap":2.18762071095E11,"vol":1.1065948010005E10,"changerate":-0.25},{"tickertime":"2020-08-15T00:00:00","openprice":11700.297193,"closeprice":11836.253893,"high":11954.471776,"low":11700.297193,"marketcap":2.18501164665E11,"vol":1.18022875599521E10,"changerate":1.16},{"tickertime":"2020-08-14T00:00:00","openprice":11499.729983,"closeprice":11725.114561,"high":11817.444117,"low":11451.348621,"marketcap":2.16449495809E11,"vol":1.20613641318159E10,"changerate":1.96},{"tickertime":"2020-08-13T00:00:00","openprice":11597.217796,"closeprice":11494.531384,"high":11655.147067,"low":11306.528084,"marketcap":2.12093495309E11,"vol":1.11525658986406E10,"changerate":-0.89},{"tickertime":"2020-08-12T00:00:00","openprice":11487.143744,"closeprice":11584.171687,"high":11614.061189,"low":11200.870429,"marketcap":2.13747510123E11,"vol":1.29128791541784E10,"changerate":0.84},{"tickertime":"2020-08-11T00:00:00","openprice":11902.521339,"closeprice":11499.759934,"high":11934.356321,"low":11465.637722,"marketcap":2.12189970877E11,"vol":1.15577415072593E10,"changerate":-3.38},{"tickertime":"2020-08-10T00:00:00","openprice":11569.794121,"closeprice":11909.120773,"high":12034.435698,"low":11525.444578,"marketcap":2.19743368949E11,"vol":1.25660039356025E10,"changerate":2.93},{"tickertime":"2020-08-09T00:00:00","openprice":11740.312802,"closeprice":11563.021932,"high":11788.42936,"low":11552.477247,"marketcap":2.13357261463E11,"vol":8.8931927830804E9,"changerate":-1.51},{"tickertime":"2020-08-08T00:00:00","openprice":11662.923264,"closeprice":11736.975478,"high":11796.790814,"low":11384.860598,"marketcap":2.16566997847E11,"vol":9.4856378401923E9,"changerate":0.63},{"tickertime":"2020-08-07T00:00:00","openprice":11837.226896,"closeprice":11640.857896,"high":11889.469958,"low":11589.657736,"marketcap":2.14793466308E11,"vol":1.07290225296345E10,"changerate":-1.66},{"tickertime":"2020-08-06T00:00:00","openprice":11640.260677,"closeprice":11835.015847,"high":11867.990716,"low":11567.101871,"marketcap":2.18376008049E11,"vol":1.19691217895526E10,"changerate":1.67},{"tickertime":"2020-08-05T00:00:00","openprice":11224.993066,"closeprice":11642.563829,"high":11670.459385,"low":11120.798915,"marketcap":2.1482494365E11,"vol":1.10954455057086E10,"changerate":3.72}]
         * changeratekline : [{"year":2020,"list":[28.96,-6.71,-27.25,31.87,13.48,-3.75,20.61,5.58]},{"year":2019,"list":[-7.71,11.39,6.53,30.34,60.24,26.16,-11.33,0.4,-16.62,13.75,-14.42,-6.56]}]
         * highpricekline : [{"year":2020,"list":[9365.127453,10323.55903,9126.914929,8350.604904,9935.621248,9802.321337,11145.334603,12388.856172]},{"year":2019,"list":[4076.63268458,4142.52692999,4106.66008466,5572.36206051,8805.7783766,13016.2317442,12561.311306,11971.953791,10854.537999,9535.565051,9364.302392,7574.980106]},{"year":2018,"list":[17527,11403.7001953,11573.2998047,9697.5,9858.15039062,7720.25,8424.26953125,7624.91,7361.66,6652.23,6530.14,4214.67193177]},{"year":2017,"list":[1154.72998047,1179.9699707,1274.98999023,1347.89001465,2443.63989258,2958.11010742,2875.34008789,4703.39013672,4892.00976562,6468.39990234,10233.5996094,19497.4003906]},{"year":2016,"list":[458.04800415,438.79800415,435.12298584,466.088989258,533.864013672,766.307983398,703.702026367,606.271972656,626.315979004,714.479003906,751.616027832,975.921020508]}]
         * total_count : 30
         * total_pages : 1
         * page : 1
         */

        private DataBean data;
        private int total_count;
        private int total_pages;
        private int page;
        private List<ListBean> list;
        private List<ChangerateklineBean> changeratekline;
        private List<HighpriceklineBean> highpricekline;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public int getTotal_count() {
            return total_count;
        }

        public void setTotal_count(int total_count) {
            this.total_count = total_count;
        }

        public int getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(int total_pages) {
            this.total_pages = total_pages;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<ChangerateklineBean> getChangeratekline() {
            return changeratekline;
        }

        public void setChangeratekline(List<ChangerateklineBean> changeratekline) {
            this.changeratekline = changeratekline;
        }

        public List<HighpriceklineBean> getHighpricekline() {
            return highpricekline;
        }

        public void setHighpricekline(List<HighpriceklineBean> highpricekline) {
            this.highpricekline = highpricekline;
        }

        public static class DataBean {
            /**
             * openprice : 11297.790569
             * closedprice : 10663.505274
             * vol : 1.70634602148935E10
             * changecount : 0
             * changerate : -5.614241927447434
             * high : 11439.907602
             * low : 10558.332644
             * high_week : 12033.209918
             * low_week : 10121.038941
             * high_month : 12386.964733
             * low_month : 10121.038941
             * high_3month : 12386.964733
             * low_3month : 8955.82555
             * high_his : 20089
             * low_his : 65.5260009766
             * high_his_time : 2017-12-16T16:00:00Z
             * low_his_time : 2013-07-04T16:00:00Z
             * price : 10271.438031
             * change : -634.285295
             * fallrate_ath : -48.87
             */

            private double openprice;
            private double closedprice;
            private double vol;
            private int changecount;
            private double changerate;
            private double high;
            private double low;
            private double high_week;
            private double low_week;
            private double high_month;
            private double low_month;
            private double high_3month;
            private double low_3month;
            private int high_his;
            private double low_his;
            private String high_his_time;
            private String low_his_time;
            private double price;
            private double change;
            private double fallrate_ath;

            public double getOpenprice() {
                return openprice;
            }

            public void setOpenprice(double openprice) {
                this.openprice = openprice;
            }

            public double getClosedprice() {
                return closedprice;
            }

            public void setClosedprice(double closedprice) {
                this.closedprice = closedprice;
            }

            public double getVol() {
                return vol;
            }

            public void setVol(double vol) {
                this.vol = vol;
            }

            public int getChangecount() {
                return changecount;
            }

            public void setChangecount(int changecount) {
                this.changecount = changecount;
            }

            public double getChangerate() {
                return changerate;
            }

            public void setChangerate(double changerate) {
                this.changerate = changerate;
            }

            public double getHigh() {
                return high;
            }

            public void setHigh(double high) {
                this.high = high;
            }

            public double getLow() {
                return low;
            }

            public void setLow(double low) {
                this.low = low;
            }

            public double getHigh_week() {
                return high_week;
            }

            public void setHigh_week(double high_week) {
                this.high_week = high_week;
            }

            public double getLow_week() {
                return low_week;
            }

            public void setLow_week(double low_week) {
                this.low_week = low_week;
            }

            public double getHigh_month() {
                return high_month;
            }

            public void setHigh_month(double high_month) {
                this.high_month = high_month;
            }

            public double getLow_month() {
                return low_month;
            }

            public void setLow_month(double low_month) {
                this.low_month = low_month;
            }

            public double getHigh_3month() {
                return high_3month;
            }

            public void setHigh_3month(double high_3month) {
                this.high_3month = high_3month;
            }

            public double getLow_3month() {
                return low_3month;
            }

            public void setLow_3month(double low_3month) {
                this.low_3month = low_3month;
            }

            public int getHigh_his() {
                return high_his;
            }

            public void setHigh_his(int high_his) {
                this.high_his = high_his;
            }

            public double getLow_his() {
                return low_his;
            }

            public void setLow_his(double low_his) {
                this.low_his = low_his;
            }

            public String getHigh_his_time() {
                return high_his_time;
            }

            public void setHigh_his_time(String high_his_time) {
                this.high_his_time = high_his_time;
            }

            public String getLow_his_time() {
                return low_his_time;
            }

            public void setLow_his_time(String low_his_time) {
                this.low_his_time = low_his_time;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public double getChange() {
                return change;
            }

            public void setChange(double change) {
                this.change = change;
            }

            public double getFallrate_ath() {
                return fallrate_ath;
            }

            public void setFallrate_ath(double fallrate_ath) {
                this.fallrate_ath = fallrate_ath;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "openprice=" + openprice +
                        ", closedprice=" + closedprice +
                        ", vol=" + vol +
                        ", changecount=" + changecount +
                        ", changerate=" + changerate +
                        ", high=" + high +
                        ", low=" + low +
                        ", high_week=" + high_week +
                        ", low_week=" + low_week +
                        ", high_month=" + high_month +
                        ", low_month=" + low_month +
                        ", high_3month=" + high_3month +
                        ", low_3month=" + low_3month +
                        ", high_his=" + high_his +
                        ", low_his=" + low_his +
                        ", high_his_time='" + high_his_time + '\'' +
                        ", low_his_time='" + low_his_time + '\'' +
                        ", price=" + price +
                        ", change=" + change +
                        ", fallrate_ath=" + fallrate_ath +
                        '}';
            }
        }

        public static class ListBean {
            /**
             * tickertime : 2020-09-03T00:00:00
             * openprice : 11297.790569
             * closeprice : 10663.505274
             * high : 11439.907602
             * low : 10558.332644
             * marketcap : 1.97022389082E11
             * vol : 1.70634602148935E10
             * changerate : -5.61
             */

            private String tickertime;
            private double openprice;
            private double closeprice;
            private double high;
            private double low;
            private double marketcap;
            private double vol;
            private double changerate;

            public String getTickertime() {
                return tickertime;
            }

            public void setTickertime(String tickertime) {
                this.tickertime = tickertime;
            }

            public double getOpenprice() {
                return openprice;
            }

            public void setOpenprice(double openprice) {
                this.openprice = openprice;
            }

            public double getCloseprice() {
                return closeprice;
            }

            public void setCloseprice(double closeprice) {
                this.closeprice = closeprice;
            }

            public double getHigh() {
                return high;
            }

            public void setHigh(double high) {
                this.high = high;
            }

            public double getLow() {
                return low;
            }

            public void setLow(double low) {
                this.low = low;
            }

            public double getMarketcap() {
                return marketcap;
            }

            public void setMarketcap(double marketcap) {
                this.marketcap = marketcap;
            }

            public double getVol() {
                return vol;
            }

            public void setVol(double vol) {
                this.vol = vol;
            }

            public double getChangerate() {
                return changerate;
            }

            public void setChangerate(double changerate) {
                this.changerate = changerate;
            }
        }

        public static class ChangerateklineBean {
            /**
             * year : 2020
             * list : [28.96,-6.71,-27.25,31.87,13.48,-3.75,20.61,5.58]
             */

            private int year;
            private List<Double> list;

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public List<Double> getList() {
                return list;
            }

            public void setList(List<Double> list) {
                this.list = list;
            }
        }

        public static class HighpriceklineBean {
            /**
             * year : 2020
             * list : [9365.127453,10323.55903,9126.914929,8350.604904,9935.621248,9802.321337,11145.334603,12388.856172]
             */

            private int year;
            private List<Double> list;

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public List<Double> getList() {
                return list;
            }

            public void setList(List<Double> list) {
                this.list = list;
            }

            @Override
            public String toString() {
                return "HighpriceklineBean{" +
                        "year=" + year +
                        ", list=" + list +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBeanX{" +
                    "data=" + data +
                    ", total_count=" + total_count +
                    ", total_pages=" + total_pages +
                    ", page=" + page +
                    ", list=" + list +
                    ", changeratekline=" + changeratekline +
                    ", highpricekline=" + highpricekline +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "OdsBbPriceHis{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
