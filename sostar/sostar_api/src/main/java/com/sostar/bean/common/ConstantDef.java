package com.sostar.bean.common;

/**
 * Created by mao_yejun on 2017/2/15.
 */
public interface ConstantDef {
    interface RESPONSE {
        String SUCCESS = "1";
        String FAIL = "0";
    }

    interface USER_TYPE {
        /**
         * 员工
         */
        String STAFF = "0";
        /**
         * 雇主
         */
        String EMPLOYER = "1";
        /**
         * 未选择
         */
        String UNCHOOSE = "-1";
    }

    interface MSG_FLG {
        /**
         * 打开
         */
        String ON = "1";
        /**
         * 关闭
         */
        String OFF = "0";
    }

    interface CONFIRM_FLG {
        /**
         * 需要确认
         */
        String NEEDCONFIRM = "1";
        /**
         * 不需要确认
         */
        String NONEEDCONFIM = "0";
    }
    interface SEX {
        /**
         * 不男不女
         */
        String MANORWOMAN ="0";
        /**
         * 男
         */
        String MAN = "1";
        /**
         * 女
         */
        String WOMAN = "2";
    }

    interface ORDER_STATUS {
        /**
         * 草稿
         */
        String DRAFT ="0";
        /**
         * 已发单
         */
        String SENDED = "1";
        /**
         * 已成单(接单结束，准备开工)
         */
        String OK = "2";
        /**
         * 已完成(定单任务玩成)
         */
        String COMPLETED = "3";
        /**
         * 9 取消
         */
        String CANCLED = "9";
    }
    interface ORDER_CONFIRMFLG{

        /**0 否
         *
         */
        String NONEED = "0";
        /**1 是
         *
         */
        String NEED = "0";
    }
    interface ORDER_RELATION_CONFIRMFLG{

        /**0 未确认
         *
         */
        String NOCONFIRM = "0";
        /**1 已确认
         *
         */
        String CONFIRMED = "1";
        /**1 已确认
         *
         */
        String REFUESED = "2";
    }

    /**
     * 成单状态
     */
    interface ORDER_OKFLAG{
        /**0 未成单
         *
         */
        String NO = "0";
        /**1 已成单
         *
         */
        String YES = "1";
    }
    interface ORDER_RELATION_STATUS{

        /**正常
         *
         */
        String OK = "0";
        /**1 已确认
         *
         */
        String CONFIRMED = "1";
        /**1 已确认
         *
         */
        String REFUESED = "2";
    }
    interface RECEIVE_ORDER_SEARCH_STATUS{
        /**最新
         *
         */
        String RECENT = "1";
        /**推介
         *
         */
        String HOT = "2";
    }
    interface UNIT_PRICE_TYPE{
        /**
         * 按日计算
         */
        String DAY = "1";
        /**
         * 按小时结算
         */
        String HOUR = "2";
    }

}
