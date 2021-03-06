package com.google.i18n.phonenumbers;

import com.waze.analytics.AnalyticsEvents;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryCodeToRegionCodeMap {
    static Map<Integer, List<String>> getCountryCodeToRegionCodeMap() throws  {
        HashMap $r0 = new HashMap(285);
        ArrayList $r1 = new ArrayList(25);
        $r1.add("US");
        $r1.add("AG");
        $r1.add("AI");
        $r1.add("AS");
        $r1.add("BB");
        $r1.add("BM");
        $r1.add("BS");
        $r1.add("CA");
        $r1.add("DM");
        $r1.add("DO");
        $r1.add("GD");
        $r1.add("GU");
        $r1.add("JM");
        $r1.add("KN");
        $r1.add("KY");
        $r1.add("LC");
        $r1.add("MP");
        $r1.add("MS");
        $r1.add("PR");
        $r1.add("SX");
        $r1.add("TC");
        $r1.add("TT");
        $r1.add("VC");
        $r1.add("VG");
        $r1.add("VI");
        $r0.put(Integer.valueOf(1), $r1);
        $r1 = new ArrayList(2);
        $r1.add("RU");
        $r1.add("KZ");
        $r0.put(Integer.valueOf(7), $r1);
        $r1 = new ArrayList(1);
        $r1.add("EG");
        $r0.put(Integer.valueOf(20), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ZA");
        $r0.put(Integer.valueOf(27), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GR");
        $r0.put(Integer.valueOf(30), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NL");
        $r0.put(Integer.valueOf(31), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BE");
        $r0.put(Integer.valueOf(32), $r1);
        $r1 = new ArrayList(1);
        $r1.add("FR");
        $r0.put(Integer.valueOf(33), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ES");
        $r0.put(Integer.valueOf(34), $r1);
        $r1 = new ArrayList(1);
        $r1.add("HU");
        $r0.put(Integer.valueOf(36), $r1);
        $r1 = new ArrayList(2);
        $r1.add("IT");
        $r1.add("VA");
        $r0.put(Integer.valueOf(39), $r1);
        $r1 = new ArrayList(1);
        $r1.add("RO");
        $r0.put(Integer.valueOf(40), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CH");
        $r0.put(Integer.valueOf(41), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AT");
        $r0.put(Integer.valueOf(43), $r1);
        $r1 = new ArrayList(4);
        $r1.add("GB");
        $r1.add("GG");
        $r1.add("IM");
        $r1.add("JE");
        $r0.put(Integer.valueOf(44), $r1);
        $r1 = new ArrayList(1);
        $r1.add("DK");
        $r0.put(Integer.valueOf(45), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SE");
        $r0.put(Integer.valueOf(46), $r1);
        $r1 = new ArrayList(2);
        $r1.add(AnalyticsEvents.ANALYTICS_NO);
        $r1.add("SJ");
        $r0.put(Integer.valueOf(47), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PL");
        $r0.put(Integer.valueOf(48), $r1);
        $r1 = new ArrayList(1);
        $r1.add("DE");
        $r0.put(Integer.valueOf(49), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PE");
        $r0.put(Integer.valueOf(51), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MX");
        $r0.put(Integer.valueOf(52), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CU");
        $r0.put(Integer.valueOf(53), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AR");
        $r0.put(Integer.valueOf(54), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BR");
        $r0.put(Integer.valueOf(55), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CL");
        $r0.put(Integer.valueOf(56), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CO");
        $r0.put(Integer.valueOf(57), $r1);
        $r1 = new ArrayList(1);
        $r1.add("VE");
        $r0.put(Integer.valueOf(58), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MY");
        $r0.put(Integer.valueOf(60), $r1);
        $r1 = new ArrayList(3);
        $r1.add("AU");
        $r1.add("CC");
        $r1.add("CX");
        $r0.put(Integer.valueOf(61), $r1);
        $r1 = new ArrayList(1);
        $r1.add(AnalyticsEvents.ANALYTICS_EVENT_INFO_ID);
        $r0.put(Integer.valueOf(62), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PH");
        $r0.put(Integer.valueOf(63), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NZ");
        $r0.put(Integer.valueOf(64), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SG");
        $r0.put(Integer.valueOf(65), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TH");
        $r0.put(Integer.valueOf(66), $r1);
        $r1 = new ArrayList(1);
        $r1.add("JP");
        $r0.put(Integer.valueOf(81), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KR");
        $r0.put(Integer.valueOf(82), $r1);
        $r1 = new ArrayList(1);
        $r1.add("VN");
        $r0.put(Integer.valueOf(84), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CN");
        $r0.put(Integer.valueOf(86), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TR");
        $r0.put(Integer.valueOf(90), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IN");
        $r0.put(Integer.valueOf(91), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PK");
        $r0.put(Integer.valueOf(92), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AF");
        $r0.put(Integer.valueOf(93), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LK");
        $r0.put(Integer.valueOf(94), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MM");
        $r0.put(Integer.valueOf(95), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IR");
        $r0.put(Integer.valueOf(98), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SS");
        $r0.put(Integer.valueOf(211), $r1);
        $r1 = new ArrayList(2);
        $r1.add("MA");
        $r1.add("EH");
        $r0.put(Integer.valueOf(212), $r1);
        $r1 = new ArrayList(1);
        $r1.add("DZ");
        $r0.put(Integer.valueOf(213), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TN");
        $r0.put(Integer.valueOf(216), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LY");
        $r0.put(Integer.valueOf(218), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GM");
        $r0.put(Integer.valueOf(220), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SN");
        $r0.put(Integer.valueOf(221), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MR");
        $r0.put(Integer.valueOf(222), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ML");
        $r0.put(Integer.valueOf(223), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GN");
        $r0.put(Integer.valueOf(224), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CI");
        $r0.put(Integer.valueOf(225), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BF");
        $r0.put(Integer.valueOf(226), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NE");
        $r0.put(Integer.valueOf(227), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TG");
        $r0.put(Integer.valueOf(228), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BJ");
        $r0.put(Integer.valueOf(229), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MU");
        $r0.put(Integer.valueOf(230), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LR");
        $r0.put(Integer.valueOf(231), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SL");
        $r0.put(Integer.valueOf(232), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GH");
        $r0.put(Integer.valueOf(233), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NG");
        $r0.put(Integer.valueOf(234), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TD");
        $r0.put(Integer.valueOf(235), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CF");
        $r0.put(Integer.valueOf(236), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CM");
        $r0.put(Integer.valueOf(237), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CV");
        $r0.put(Integer.valueOf(238), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ST");
        $r0.put(Integer.valueOf(239), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GQ");
        $r0.put(Integer.valueOf(240), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GA");
        $r0.put(Integer.valueOf(241), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CG");
        $r0.put(Integer.valueOf(242), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CD");
        $r0.put(Integer.valueOf(243), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AO");
        $r0.put(Integer.valueOf(244), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GW");
        $r0.put(Integer.valueOf(245), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IO");
        $r0.put(Integer.valueOf(246), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AC");
        $r0.put(Integer.valueOf(247), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SC");
        $r0.put(Integer.valueOf(248), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SD");
        $r0.put(Integer.valueOf(249), $r1);
        $r1 = new ArrayList(1);
        $r1.add("RW");
        $r0.put(Integer.valueOf(250), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ET");
        $r0.put(Integer.valueOf(251), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SO");
        $r0.put(Integer.valueOf(252), $r1);
        $r1 = new ArrayList(1);
        $r1.add("DJ");
        $r0.put(Integer.valueOf(253), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KE");
        $r0.put(Integer.valueOf(254), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TZ");
        $r0.put(Integer.valueOf(255), $r1);
        $r1 = new ArrayList(1);
        $r1.add("UG");
        $r0.put(Integer.valueOf(256), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BI");
        $r0.put(Integer.valueOf(257), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MZ");
        $r0.put(Integer.valueOf(258), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ZM");
        $r0.put(Integer.valueOf(260), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MG");
        $r0.put(Integer.valueOf(261), $r1);
        $r1 = new ArrayList(2);
        $r1.add("RE");
        $r1.add("YT");
        $r0.put(Integer.valueOf(262), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ZW");
        $r0.put(Integer.valueOf(263), $r1);
        $r1 = new ArrayList(1);
        $r1.add(AnalyticsEvents.ANALYTICS_EVENT_NETWORK_MODE_NA);
        $r0.put(Integer.valueOf(264), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MW");
        $r0.put(Integer.valueOf(265), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LS");
        $r0.put(Integer.valueOf(266), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BW");
        $r0.put(Integer.valueOf(267), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SZ");
        $r0.put(Integer.valueOf(268), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KM");
        $r0.put(Integer.valueOf(269), $r1);
        $r1 = new ArrayList(2);
        $r1.add("SH");
        $r1.add("TA");
        $r0.put(Integer.valueOf(290), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ER");
        $r0.put(Integer.valueOf(291), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AW");
        $r0.put(Integer.valueOf(297), $r1);
        $r1 = new ArrayList(1);
        $r1.add("FO");
        $r0.put(Integer.valueOf(298), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GL");
        $r0.put(Integer.valueOf(299), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GI");
        $r0.put(Integer.valueOf(350), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PT");
        $r0.put(Integer.valueOf(351), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LU");
        $r0.put(Integer.valueOf(352), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IE");
        $r0.put(Integer.valueOf(353), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IS");
        $r0.put(Integer.valueOf(354), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AL");
        $r0.put(Integer.valueOf(355), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MT");
        $r0.put(Integer.valueOf(356), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CY");
        $r0.put(Integer.valueOf(357), $r1);
        $r1 = new ArrayList(2);
        $r1.add("FI");
        $r1.add("AX");
        $r0.put(Integer.valueOf(358), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BG");
        $r0.put(Integer.valueOf(359), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LT");
        $r0.put(Integer.valueOf(370), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LV");
        $r0.put(Integer.valueOf(371), $r1);
        $r1 = new ArrayList(1);
        $r1.add("EE");
        $r0.put(Integer.valueOf(372), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MD");
        $r0.put(Integer.valueOf(373), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AM");
        $r0.put(Integer.valueOf(374), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BY");
        $r0.put(Integer.valueOf(375), $r1);
        $r1 = new ArrayList(1);
        $r1.add(AnalyticsEvents.ANALYTICS_EVENT_INFO_AD);
        $r0.put(Integer.valueOf(376), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MC");
        $r0.put(Integer.valueOf(377), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SM");
        $r0.put(Integer.valueOf(378), $r1);
        $r1 = new ArrayList(1);
        $r1.add("UA");
        $r0.put(Integer.valueOf(380), $r1);
        $r1 = new ArrayList(1);
        $r1.add("RS");
        $r0.put(Integer.valueOf(381), $r1);
        $r1 = new ArrayList(1);
        $r1.add("ME");
        $r0.put(Integer.valueOf(382), $r1);
        $r1 = new ArrayList(1);
        $r1.add("HR");
        $r0.put(Integer.valueOf(385), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SI");
        $r0.put(Integer.valueOf(386), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BA");
        $r0.put(Integer.valueOf(387), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MK");
        $r0.put(Integer.valueOf(389), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CZ");
        $r0.put(Integer.valueOf(420), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SK");
        $r0.put(Integer.valueOf(421), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LI");
        $r0.put(Integer.valueOf(423), $r1);
        $r1 = new ArrayList(1);
        $r1.add("FK");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NO_NETWORK_CONNECTION__UNABLE_TO_REPORT), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BZ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NO), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GT");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NOTEC__IN_THIS_VERSION_YOU_CAN), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SV");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NOTEC), $r1);
        $r1 = new ArrayList(1);
        $r1.add("HN");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NOT_NOW), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NI");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NOT_THERE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CR");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NO_WAZEQ), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PA");
        $r0.put(Integer.valueOf(DisplayStrings.DS_NO_WAZEQ_TAP), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PM");
        $r0.put(Integer.valueOf(DisplayStrings.DS_OAVAILABLE_TO_ALLU), $r1);
        $r1 = new ArrayList(1);
        $r1.add("HT");
        $r0.put(Integer.valueOf(DisplayStrings.DS_OBJECT_ON_ROAD), $r1);
        $r1 = new ArrayList(3);
        $r1.add("GP");
        $r1.add("BL");
        $r1.add("MF");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SAVE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BO");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SCOREBOARD_IS_CURRENTLY_NOT_AVAILABLE_IN_YOUR_AREA), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GY");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SEARCHING_NETWORK__________), $r1);
        $r1 = new ArrayList(1);
        $r1.add("EC");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SEARCH), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GF");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SENDING_ADDRESS_SEARCH_INFO___), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PY");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SENDING_COMMENT_FAILED), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MQ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SENDING_MARKERS_FAILED), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SR");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SENDING_MESSAGE_FAILED), $r1);
        $r1 = new ArrayList(1);
        $r1.add("UY");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SENDING_PING_FAILED__PLEASE_TRY_AGAIN_LATER), $r1);
        $r1 = new ArrayList(2);
        $r1.add("CW");
        $r1.add("BQ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SENDING_PING______), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TL");
        $r0.put(Integer.valueOf(DisplayStrings.DS_USER_NAME), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NF");
        $r0.put(Integer.valueOf(DisplayStrings.DS_VIA), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BN");
        $r0.put(Integer.valueOf(DisplayStrings.DS_VIDEO_COULD_NOT_START), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NR");
        $r0.put(Integer.valueOf(DisplayStrings.DS_VISIBLE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PG");
        $r0.put(Integer.valueOf(DisplayStrings.DS_VOICE_DOWNLOAD_FAILED), $r1);
        $r1 = new ArrayList(1);
        $r1.add(AnalyticsEvents.ANALYTICS_EVENT_VALUE_TO);
        $r0.put(Integer.valueOf(DisplayStrings.DS_WARNING), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SB");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE_GROUP_ICONS), $r1);
        $r1 = new ArrayList(1);
        $r1.add("VU");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE_NEWBIE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("FJ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE_UPDATE_H_HERECS_THE_PLACEE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PW");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE_UPDATE_H_ISLL_BE_LATE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("WF");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("CK");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE_WILL_NOW_CLOSE_AND_YOUSLL_BE_REDIRECTED_TO_THE_APPSTORE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NU");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WEATHER_HAZARD), $r1);
        $r1 = new ArrayList(1);
        $r1.add("WS");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WELCOME_BACK), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KI");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WELCOME), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NC");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WE_LOVE_YOUE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TV");
        $r0.put(Integer.valueOf(DisplayStrings.f149x970b7d12), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PF");
        $r0.put(Integer.valueOf(DisplayStrings.f150x490377fe), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TK");
        $r0.put(Integer.valueOf(DisplayStrings.DS_YES), $r1);
        $r1 = new ArrayList(1);
        $r1.add("FM");
        $r0.put(Integer.valueOf(DisplayStrings.DS_YOU_ARE_NOT_CONNECTED__CANST_CALCULATE_ROUTE_), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MH");
        $r0.put(Integer.valueOf(DisplayStrings.DS_YOU_ARE_NOT_CONNECTED__CANST_RECALCULATE_ROUTE_), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_EVENT), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_SELECT_COUNTRY), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KP");
        $r0.put(Integer.valueOf(DisplayStrings.DS_AS_SOON_AS_YOUR_FRIEND_CONFIRMS), $r1);
        $r1 = new ArrayList(1);
        $r1.add("HK");
        $r0.put(Integer.valueOf(DisplayStrings.DS_OTHERS_SEE_YOUR_NICKNAME), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MO");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SEE_MORE_FAMILIAR_FACES), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KH");
        $r0.put(Integer.valueOf(DisplayStrings.DS_ADD_A_MESSAGE_OPTIONAL), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LA");
        $r0.put(Integer.valueOf(DisplayStrings.DS_GREAT_X), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_EDIT_LOCATION), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_COULD_NOT_DISCONNECT_FROM_FACEBOOK__TRY_AGAIN_LATER_), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BD");
        $r0.put(Integer.valueOf(DisplayStrings.DS_DESCRIPTION_ANOTHER_FB_CONNECTED), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_SWITCH), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_CAR_UNIT_FEATURE_DISABLED), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_WE_WILL_NEVER_POST_WITHOUT_APPROVAL), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TW");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SCROLL_DOWN_TO_ACCEPT), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_OTHER_WAZERS_AND), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MV");
        $r0.put(Integer.valueOf(DisplayStrings.DS_POST_EVENT_WALL_WAZE_TEXT), $r1);
        $r1 = new ArrayList(1);
        $r1.add("LB");
        $r0.put(Integer.valueOf(DisplayStrings.DS_POST_NOW), $r1);
        $r1 = new ArrayList(1);
        $r1.add("JO");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SAVE_EVENT_LOCATION), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SY");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SAVE_AND_POST_TO_EVENT_WALL), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IQ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_EVENT_CONFIRM_NO_LOCATION), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KW");
        $r0.put(Integer.valueOf(DisplayStrings.DS_REMOVE_EVENT), $r1);
        $r1 = new ArrayList(1);
        $r1.add("SA");
        $r0.put(Integer.valueOf(DisplayStrings.DS_VERIFY_ADDRESS), $r1);
        $r1 = new ArrayList(1);
        $r1.add("YE");
        $r0.put(Integer.valueOf(DisplayStrings.DS_DRIVE_WITH_WAZE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("OM");
        $r0.put(Integer.valueOf(DisplayStrings.DS_BOTTOMBAR_REROUTING_TITLE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("PS");
        $r0.put(Integer.valueOf(DisplayStrings.DS_BOTTOMBAR_REROUTING_TIME), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AE");
        $r0.put(Integer.valueOf(DisplayStrings.DS_SPEEDC), $r1);
        $r1 = new ArrayList(1);
        $r1.add("IL");
        $r0.put(Integer.valueOf(DisplayStrings.DS_WAZE_IS_SLEEPING), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BH");
        $r0.put(Integer.valueOf(DisplayStrings.DS_TIP_BATTERY_LIFE_TEXT), $r1);
        $r1 = new ArrayList(1);
        $r1.add("QA");
        $r0.put(Integer.valueOf(DisplayStrings.DS_BACK_TO_WAZE), $r1);
        $r1 = new ArrayList(1);
        $r1.add("BT");
        $r0.put(Integer.valueOf(DisplayStrings.DS_MORE_RESULTS_FOR_PS), $r1);
        $r1 = new ArrayList(1);
        $r1.add("MN");
        $r0.put(Integer.valueOf(DisplayStrings.DS_APP_VOLUME), $r1);
        $r1 = new ArrayList(1);
        $r1.add("NP");
        $r0.put(Integer.valueOf(DisplayStrings.DS_VOICE_LANGUAGE), $r1);
        $r1 = new ArrayList(1);
        $r1.add(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY);
        $r0.put(Integer.valueOf(DisplayStrings.DS_REMOVE_ITEM_FROM_LIST), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TJ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_TRAFFIC_AND_REPORTS), $r1);
        $r1 = new ArrayList(1);
        $r1.add("TM");
        $r0.put(Integer.valueOf(DisplayStrings.DS_CONNECT_WITH_TWITTER_TO_EASILY_TWEET), $r1);
        $r1 = new ArrayList(1);
        $r1.add("AZ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_AUTOMATIC_SHARING), $r1);
        $r1 = new ArrayList(1);
        $r1.add("GE");
        $r0.put(Integer.valueOf(DisplayStrings.DS_MY_SCOREBOARD), $r1);
        $r1 = new ArrayList(1);
        $r1.add("KG");
        $r0.put(Integer.valueOf(DisplayStrings.DS_MY_PROFILE_LINK), $r1);
        $r1 = new ArrayList(1);
        $r1.add("UZ");
        $r0.put(Integer.valueOf(DisplayStrings.DS_EMAIL_YOUR_FRIENDS), $r1);
        return $r0;
    }
}
