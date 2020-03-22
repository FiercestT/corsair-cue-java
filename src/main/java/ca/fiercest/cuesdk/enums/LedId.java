package ca.fiercest.cuesdk.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LedId
{
	CLI_Invalid(0),
	CLK_Escape(1),
	CLK_F1(2),
	CLK_F2(3),
	CLK_F3(4),
	CLK_F4(5),
	CLK_F5(6),
	CLK_F6(7),
	CLK_F7(8),
	CLK_F8(9),
	CLK_F9(10),
	CLK_F10(11),
	CLK_F11(12),
	CLK_GraveAccentAndTilde(13),
	CLK_1(14),
	CLK_2(15),
	CLK_3(16),
	CLK_4(17),
	CLK_5(18),
	CLK_6(19),
	CLK_7(20),
	CLK_8(21),
	CLK_9(22),
	CLK_0(23),
	CLK_MinusAndUnderscore(24),
	CLK_Tab(25),
	CLK_Q(26),
	CLK_W(27),
	CLK_E(28),
	CLK_R(29),
	CLK_T(30),
	CLK_Y(31),
	CLK_U(32),
	CLK_I(33),
	CLK_O(34),
	CLK_P(35),
	CLK_BracketLeft(36),
	CLK_CapsLock(37),
	CLK_A(38),
	CLK_S(39),
	CLK_D(40),
	CLK_F(41),
	CLK_G(42),
	CLK_H(43),
	CLK_J(44),
	CLK_K(45),
	CLK_L(46),
	CLK_SemicolonAndColon(47),
	CLK_ApostropheAndDoubleQuote(48),
	CLK_LeftShift(49),
	CLK_NonUsBackslash(50),
	CLK_Z(51),
	CLK_X(52),
	CLK_C(53),
	CLK_V(54),
	CLK_B(55),
	CLK_N(56),
	CLK_M(57),
	CLK_CommaAndLessThan(58),
	CLK_PeriodAndBiggerThan(59),
	CLK_SlashAndQuestionMark(60),
	CLK_LeftCtrl(61),
	CLK_LeftGui(62),
	CLK_LeftAlt(63),
	CLK_Lang2(64),
	CLK_Space(65),
	CLK_Lang1(66),
	CLK_International2(67),
	CLK_RightAlt(68),
	CLK_RightGui(69),
	CLK_Application(70),
	CLK_LedProgramming(71),
	CLK_Brightness(72),
	CLK_F12(73),
	CLK_PrintScreen(74),
	CLK_ScrollLock(75),
	CLK_PauseBreak(76),
	CLK_Insert(77),
	CLK_Home(78),
	CLK_PageUp(79),
	CLK_BracketRight(80),
	CLK_Backslash(81),
	CLK_NonUsTilde(82),
	CLK_Enter(83),
	CLK_International1(84),
	CLK_EqualsAndPlus(85),
	CLK_International3(86),
	CLK_Backspace(87),
	CLK_Delete(88),
	CLK_End(89),
	CLK_PageDown(90),
	CLK_RightShift(91),
	CLK_RightCtrl(92),
	CLK_UpArrow(93),
	CLK_LeftArrow(94),
	CLK_DownArrow(95),
	CLK_RightArrow(96),
	CLK_WinLock(97),
	CLK_Mute(98),
	CLK_Stop(99),
	CLK_ScanPreviousTrack(100),
	CLK_PlayPause(101),
	CLK_ScanNextTrack(102),
	CLK_NumLock(103),
	CLK_KeypadSlash(104),
	CLK_KeypadAsterisk(105),
	CLK_KeypadMinus(106),
	CLK_KeypadPlus(107),
	CLK_KeypadEnter(108),
	CLK_Keypad7(109),
	CLK_Keypad8(110),
	CLK_Keypad9(111),
	CLK_KeypadComma(112),
	CLK_Keypad4(113),
	CLK_Keypad5(114),
	CLK_Keypad6(115),
	CLK_Keypad1(116),
	CLK_Keypad2(117),
	CLK_Keypad3(118),
	CLK_Keypad0(119),
	CLK_KeypadPeriodAndDelete(120),
	CLK_G1(121),
	CLK_G2(122),
	CLK_G3(123),
	CLK_G4(124),
	CLK_G5(125),
	CLK_G6(126),
	CLK_G7(127),
	CLK_G8(128),
	CLK_G9(129),
	CLK_G10(130),
	CLK_VolumeUp(131),
	CLK_VolumeDown(132),
	CLK_MR(133),
	CLK_M1(134),
	CLK_M2(135),
	CLK_M3(136),
	CLK_G11(137),
	CLK_G12(138),
	CLK_G13(139),
	CLK_G14(140),
	CLK_G15(141),
	CLK_G16(142),
	CLK_G17(143),
	CLK_G18(144),
	CLK_International5(145),
	CLK_International4(146),
	CLK_Fn(147),

	CLM_1(148),
	CLM_2(149),
	CLM_3(150),
	CLM_4(151),

	CLH_LeftLogo(152),
	CLH_RightLogo(153),

	CLK_Logo(154),

	CLMM_Zone1(155),
	CLMM_Zone2(156),
	CLMM_Zone3(157),
	CLMM_Zone4(158),
	CLMM_Zone5(159),
	CLMM_Zone6(160),
	CLMM_Zone7(161),
	CLMM_Zone8(162),
	CLMM_Zone9(163),
	CLMM_Zone10(164),
	CLMM_Zone11(165),
	CLMM_Zone12(166),
	CLMM_Zone13(167),
	CLMM_Zone14(168),
	CLMM_Zone15(169),

	CLKLP_Zone1(170),
	CLKLP_Zone2(171),
	CLKLP_Zone3(172),
	CLKLP_Zone4(173),
	CLKLP_Zone5(174),
	CLKLP_Zone6(175),
	CLKLP_Zone7(176),
	CLKLP_Zone8(177),
	CLKLP_Zone9(178),
	CLKLP_Zone10(179),
	CLKLP_Zone11(180),
	CLKLP_Zone12(181),
	CLKLP_Zone13(182),
	CLKLP_Zone14(183),
	CLKLP_Zone15(184),
	CLKLP_Zone16(185),
	CLKLP_Zone17(186),
	CLKLP_Zone18(187),
	CLKLP_Zone19(188),

	CLM_5(189),
	CLM_6(190),

	CLHSS_Zone1(191),
	CLHSS_Zone2(192),
	CLHSS_Zone3(193),
	CLHSS_Zone4(194),
	CLHSS_Zone5(195),
	CLHSS_Zone6(196),
	CLHSS_Zone7(197),
	CLHSS_Zone8(198),
	CLHSS_Zone9(199),

	CLD_C1_1(200),
	CLD_C1_2(201),
	CLD_C1_3(202),
	CLD_C1_4(203),
	CLD_C1_5(204),
	CLD_C1_6(205),
	CLD_C1_7(206),
	CLD_C1_8(207),
	CLD_C1_9(208),
	CLD_C1_10(209),
	CLD_C1_11(210),
	CLD_C1_12(211),
	CLD_C1_13(212),
	CLD_C1_14(213),
	CLD_C1_15(214),
	CLD_C1_16(215),
	CLD_C1_17(216),
	CLD_C1_18(217),
	CLD_C1_19(218),
	CLD_C1_20(219),
	CLD_C1_21(220),
	CLD_C1_22(221),
	CLD_C1_23(222),
	CLD_C1_24(223),
	CLD_C1_25(224),
	CLD_C1_26(225),
	CLD_C1_27(226),
	CLD_C1_28(227),
	CLD_C1_29(228),
	CLD_C1_30(229),
	CLD_C1_31(230),
	CLD_C1_32(231),
	CLD_C1_33(232),
	CLD_C1_34(233),
	CLD_C1_35(234),
	CLD_C1_36(235),
	CLD_C1_37(236),
	CLD_C1_38(237),
	CLD_C1_39(238),
	CLD_C1_40(239),
	CLD_C1_41(240),
	CLD_C1_42(241),
	CLD_C1_43(242),
	CLD_C1_44(243),
	CLD_C1_45(244),
	CLD_C1_46(245),
	CLD_C1_47(246),
	CLD_C1_48(247),
	CLD_C1_49(248),
	CLD_C1_50(249),
	CLD_C1_51(250),
	CLD_C1_52(251),
	CLD_C1_53(252),
	CLD_C1_54(253),
	CLD_C1_55(254),
	CLD_C1_56(255),
	CLD_C1_57(256),
	CLD_C1_58(257),
	CLD_C1_59(258),
	CLD_C1_60(259),
	CLD_C1_61(260),
	CLD_C1_62(261),
	CLD_C1_63(262),
	CLD_C1_64(263),
	CLD_C1_65(264),
	CLD_C1_66(265),
	CLD_C1_67(266),
	CLD_C1_68(267),
	CLD_C1_69(268),
	CLD_C1_70(269),
	CLD_C1_71(270),
	CLD_C1_72(271),
	CLD_C1_73(272),
	CLD_C1_74(273),
	CLD_C1_75(274),
	CLD_C1_76(275),
	CLD_C1_77(276),
	CLD_C1_78(277),
	CLD_C1_79(278),
	CLD_C1_80(279),
	CLD_C1_81(280),
	CLD_C1_82(281),
	CLD_C1_83(282),
	CLD_C1_84(283),
	CLD_C1_85(284),
	CLD_C1_86(285),
	CLD_C1_87(286),
	CLD_C1_88(287),
	CLD_C1_89(288),
	CLD_C1_90(289),
	CLD_C1_91(290),
	CLD_C1_92(291),
	CLD_C1_93(292),
	CLD_C1_94(293),
	CLD_C1_95(294),
	CLD_C1_96(295),
	CLD_C1_97(296),
	CLD_C1_98(297),
	CLD_C1_99(298),
	CLD_C1_100(299),
	CLD_C1_101(300),
	CLD_C1_102(301),
	CLD_C1_103(302),
	CLD_C1_104(303),
	CLD_C1_105(304),
	CLD_C1_106(305),
	CLD_C1_107(306),
	CLD_C1_108(307),
	CLD_C1_109(308),
	CLD_C1_110(309),
	CLD_C1_111(310),
	CLD_C1_112(311),
	CLD_C1_113(312),
	CLD_C1_114(313),
	CLD_C1_115(314),
	CLD_C1_116(315),
	CLD_C1_117(316),
	CLD_C1_118(317),
	CLD_C1_119(318),
	CLD_C1_120(319),
	CLD_C1_121(320),
	CLD_C1_122(321),
	CLD_C1_123(322),
	CLD_C1_124(323),
	CLD_C1_125(324),
	CLD_C1_126(325),
	CLD_C1_127(326),
	CLD_C1_128(327),
	CLD_C1_129(328),
	CLD_C1_130(329),
	CLD_C1_131(330),
	CLD_C1_132(331),
	CLD_C1_133(332),
	CLD_C1_134(333),
	CLD_C1_135(334),
	CLD_C1_136(335),
	CLD_C1_137(336),
	CLD_C1_138(337),
	CLD_C1_139(338),
	CLD_C1_140(339),
	CLD_C1_141(340),
	CLD_C1_142(341),
	CLD_C1_143(342),
	CLD_C1_144(343),
	CLD_C1_145(344),
	CLD_C1_146(345),
	CLD_C1_147(346),
	CLD_C1_148(347),
	CLD_C1_149(348),
	CLD_C1_150(349),

	CLD_C2_1(350),
	CLD_C2_2(351),
	CLD_C2_3(352),
	CLD_C2_4(353),
	CLD_C2_5(354),
	CLD_C2_6(355),
	CLD_C2_7(356),
	CLD_C2_8(357),
	CLD_C2_9(358),
	CLD_C2_10(359),
	CLD_C2_11(360),
	CLD_C2_12(361),
	CLD_C2_13(362),
	CLD_C2_14(363),
	CLD_C2_15(364),
	CLD_C2_16(365),
	CLD_C2_17(366),
	CLD_C2_18(367),
	CLD_C2_19(368),
	CLD_C2_20(369),
	CLD_C2_21(370),
	CLD_C2_22(371),
	CLD_C2_23(372),
	CLD_C2_24(373),
	CLD_C2_25(374),
	CLD_C2_26(375),
	CLD_C2_27(376),
	CLD_C2_28(377),
	CLD_C2_29(378),
	CLD_C2_30(379),
	CLD_C2_31(380),
	CLD_C2_32(381),
	CLD_C2_33(382),
	CLD_C2_34(383),
	CLD_C2_35(384),
	CLD_C2_36(385),
	CLD_C2_37(386),
	CLD_C2_38(387),
	CLD_C2_39(388),
	CLD_C2_40(389),
	CLD_C2_41(390),
	CLD_C2_42(391),
	CLD_C2_43(392),
	CLD_C2_44(393),
	CLD_C2_45(394),
	CLD_C2_46(395),
	CLD_C2_47(396),
	CLD_C2_48(397),
	CLD_C2_49(398),
	CLD_C2_50(399),
	CLD_C2_51(400),
	CLD_C2_52(401),
	CLD_C2_53(402),
	CLD_C2_54(403),
	CLD_C2_55(404),
	CLD_C2_56(405),
	CLD_C2_57(406),
	CLD_C2_58(407),
	CLD_C2_59(408),
	CLD_C2_60(409),
	CLD_C2_61(410),
	CLD_C2_62(411),
	CLD_C2_63(412),
	CLD_C2_64(413),
	CLD_C2_65(414),
	CLD_C2_66(415),
	CLD_C2_67(416),
	CLD_C2_68(417),
	CLD_C2_69(418),
	CLD_C2_70(419),
	CLD_C2_71(420),
	CLD_C2_72(421),
	CLD_C2_73(422),
	CLD_C2_74(423),
	CLD_C2_75(424),
	CLD_C2_76(425),
	CLD_C2_77(426),
	CLD_C2_78(427),
	CLD_C2_79(428),
	CLD_C2_80(429),
	CLD_C2_81(430),
	CLD_C2_82(431),
	CLD_C2_83(432),
	CLD_C2_84(433),
	CLD_C2_85(434),
	CLD_C2_86(435),
	CLD_C2_87(436),
	CLD_C2_88(437),
	CLD_C2_89(438),
	CLD_C2_90(439),
	CLD_C2_91(440),
	CLD_C2_92(441),
	CLD_C2_93(442),
	CLD_C2_94(443),
	CLD_C2_95(444),
	CLD_C2_96(445),
	CLD_C2_97(446),
	CLD_C2_98(447),
	CLD_C2_99(448),
	CLD_C2_100(449),
	CLD_C2_101(450),
	CLD_C2_102(451),
	CLD_C2_103(452),
	CLD_C2_104(453),
	CLD_C2_105(454),
	CLD_C2_106(455),
	CLD_C2_107(456),
	CLD_C2_108(457),
	CLD_C2_109(458),
	CLD_C2_110(459),
	CLD_C2_111(460),
	CLD_C2_112(461),
	CLD_C2_113(462),
	CLD_C2_114(463),
	CLD_C2_115(464),
	CLD_C2_116(465),
	CLD_C2_117(466),
	CLD_C2_118(467),
	CLD_C2_119(468),
	CLD_C2_120(469),
	CLD_C2_121(470),
	CLD_C2_122(471),
	CLD_C2_123(472),
	CLD_C2_124(473),
	CLD_C2_125(474),
	CLD_C2_126(475),
	CLD_C2_127(476),
	CLD_C2_128(477),
	CLD_C2_129(478),
	CLD_C2_130(479),
	CLD_C2_131(480),
	CLD_C2_132(481),
	CLD_C2_133(482),
	CLD_C2_134(483),
	CLD_C2_135(484),
	CLD_C2_136(485),
	CLD_C2_137(486),
	CLD_C2_138(487),
	CLD_C2_139(488),
	CLD_C2_140(489),
	CLD_C2_141(490),
	CLD_C2_142(491),
	CLD_C2_143(492),
	CLD_C2_144(493),
	CLD_C2_145(494),
	CLD_C2_146(495),
	CLD_C2_147(496),
	CLD_C2_148(497),
	CLD_C2_149(498),
	CLD_C2_150(499),

	CLI_Oem1(500),
	CLI_Oem2(501),
	CLI_Oem3(502),
	CLI_Oem4(503),
	CLI_Oem5(504),
	CLI_Oem6(505),
	CLI_Oem7(506),
	CLI_Oem8(507),
	CLI_Oem9(508),
	CLI_Oem10(509),
	CLI_Oem11(510),
	CLI_Oem12(511),
	CLI_Oem13(512),
	CLI_Oem14(513),
	CLI_Oem15(514),
	CLI_Oem16(515),
	CLI_Oem17(516),
	CLI_Oem18(517),
	CLI_Oem19(518),
	CLI_Oem20(519),
	CLI_Oem21(520),
	CLI_Oem22(521),
	CLI_Oem23(522),
	CLI_Oem24(523),
	CLI_Oem25(524),
	CLI_Oem26(525),
	CLI_Oem27(526),
	CLI_Oem28(527),
	CLI_Oem29(528),
	CLI_Oem30(529),
	CLI_Oem31(530),
	CLI_Oem32(531),
	CLI_Oem33(532),
	CLI_Oem34(533),
	CLI_Oem35(534),
	CLI_Oem36(535),
	CLI_Oem37(536),
	CLI_Oem38(537),
	CLI_Oem39(538),
	CLI_Oem40(539),
	CLI_Oem41(540),
	CLI_Oem42(541),
	CLI_Oem43(542),
	CLI_Oem44(543),
	CLI_Oem45(544),
	CLI_Oem46(545),
	CLI_Oem47(546),
	CLI_Oem48(547),
	CLI_Oem49(548),
	CLI_Oem50(549),
	CLI_Oem51(550),
	CLI_Oem52(551),
	CLI_Oem53(552),
	CLI_Oem54(553),
	CLI_Oem55(554),
	CLI_Oem56(555),
	CLI_Oem57(556),
	CLI_Oem58(557),
	CLI_Oem59(558),
	CLI_Oem60(559),
	CLI_Oem61(560),
	CLI_Oem62(561),
	CLI_Oem63(562),
	CLI_Oem64(563),
	CLI_Oem65(564),
	CLI_Oem66(565),
	CLI_Oem67(566),
	CLI_Oem68(567),
	CLI_Oem69(568),
	CLI_Oem70(569),
	CLI_Oem71(570),
	CLI_Oem72(571),
	CLI_Oem73(572),
	CLI_Oem74(573),
	CLI_Oem75(574),
	CLI_Oem76(575),
	CLI_Oem77(576),
	CLI_Oem78(577),
	CLI_Oem79(578),
	CLI_Oem80(579),
	CLI_Oem81(580),
	CLI_Oem82(581),
	CLI_Oem83(582),
	CLI_Oem84(583),
	CLI_Oem85(584),
	CLI_Oem86(585),
	CLI_Oem87(586),
	CLI_Oem88(587),
	CLI_Oem89(588),
	CLI_Oem90(589),
	CLI_Oem91(590),
	CLI_Oem92(591),
	CLI_Oem93(592),
	CLI_Oem94(593),
	CLI_Oem95(594),
	CLI_Oem96(595),
	CLI_Oem97(596),
	CLI_Oem98(597),
	CLI_Oem99(598),
	CLI_Oem100(599),

	CLDRAM_1(600),
	CLDRAM_2(601),
	CLDRAM_3(602),
	CLDRAM_4(603),
	CLDRAM_5(604),
	CLDRAM_6(605),
	CLDRAM_7(606),
	CLDRAM_8(607),
	CLDRAM_9(608),
	CLDRAM_10(609),
	CLDRAM_11(610),
	CLDRAM_12(611),

	CLD_C3_1(612),
	CLD_C3_2(613),
	CLD_C3_3(614),
	CLD_C3_4(615),
	CLD_C3_5(616),
	CLD_C3_6(617),
	CLD_C3_7(618),
	CLD_C3_8(619),
	CLD_C3_9(620),
	CLD_C3_10(621),
	CLD_C3_11(622),
	CLD_C3_12(623),
	CLD_C3_13(624),
	CLD_C3_14(625),
	CLD_C3_15(626),
	CLD_C3_16(627),
	CLD_C3_17(628),
	CLD_C3_18(629),
	CLD_C3_19(630),
	CLD_C3_20(631),
	CLD_C3_21(632),
	CLD_C3_22(633),
	CLD_C3_23(634),
	CLD_C3_24(635),
	CLD_C3_25(636),
	CLD_C3_26(637),
	CLD_C3_27(638),
	CLD_C3_28(639),
	CLD_C3_29(640),
	CLD_C3_30(641),
	CLD_C3_31(642),
	CLD_C3_32(643),
	CLD_C3_33(644),
	CLD_C3_34(645),
	CLD_C3_35(646),
	CLD_C3_36(647),
	CLD_C3_37(648),
	CLD_C3_38(649),
	CLD_C3_39(650),
	CLD_C3_40(651),
	CLD_C3_41(652),
	CLD_C3_42(653),
	CLD_C3_43(654),
	CLD_C3_44(655),
	CLD_C3_45(656),
	CLD_C3_46(657),
	CLD_C3_47(658),
	CLD_C3_48(659),
	CLD_C3_49(660),
	CLD_C3_50(661),
	CLD_C3_51(662),
	CLD_C3_52(663),
	CLD_C3_53(664),
	CLD_C3_54(665),
	CLD_C3_55(666),
	CLD_C3_56(667),
	CLD_C3_57(668),
	CLD_C3_58(669),
	CLD_C3_59(670),
	CLD_C3_60(671),
	CLD_C3_61(672),
	CLD_C3_62(673),
	CLD_C3_63(674),
	CLD_C3_64(675),
	CLD_C3_65(676),
	CLD_C3_66(677),
	CLD_C3_67(678),
	CLD_C3_68(679),
	CLD_C3_69(680),
	CLD_C3_70(681),
	CLD_C3_71(682),
	CLD_C3_72(683),
	CLD_C3_73(684),
	CLD_C3_74(685),
	CLD_C3_75(686),
	CLD_C3_76(687),
	CLD_C3_77(688),
	CLD_C3_78(689),
	CLD_C3_79(690),
	CLD_C3_80(691),
	CLD_C3_81(692),
	CLD_C3_82(693),
	CLD_C3_83(694),
	CLD_C3_84(695),
	CLD_C3_85(696),
	CLD_C3_86(697),
	CLD_C3_87(698),
	CLD_C3_88(699),
	CLD_C3_89(700),
	CLD_C3_90(701),
	CLD_C3_91(702),
	CLD_C3_92(703),
	CLD_C3_93(704),
	CLD_C3_94(705),
	CLD_C3_95(706),
	CLD_C3_96(707),
	CLD_C3_97(708),
	CLD_C3_98(709),
	CLD_C3_99(710),
	CLD_C3_100(711),
	CLD_C3_101(712),
	CLD_C3_102(713),
	CLD_C3_103(714),
	CLD_C3_104(715),
	CLD_C3_105(716),
	CLD_C3_106(717),
	CLD_C3_107(718),
	CLD_C3_108(719),
	CLD_C3_109(720),
	CLD_C3_110(721),
	CLD_C3_111(722),
	CLD_C3_112(723),
	CLD_C3_113(724),
	CLD_C3_114(725),
	CLD_C3_115(726),
	CLD_C3_116(727),
	CLD_C3_117(728),
	CLD_C3_118(729),
	CLD_C3_119(730),
	CLD_C3_120(731),
	CLD_C3_121(732),
	CLD_C3_122(733),
	CLD_C3_123(734),
	CLD_C3_124(735),
	CLD_C3_125(736),
	CLD_C3_126(737),
	CLD_C3_127(738),
	CLD_C3_128(739),
	CLD_C3_129(740),
	CLD_C3_130(741),
	CLD_C3_131(742),
	CLD_C3_132(743),
	CLD_C3_133(744),
	CLD_C3_134(745),
	CLD_C3_135(746),
	CLD_C3_136(747),
	CLD_C3_137(748),
	CLD_C3_138(749),
	CLD_C3_139(750),
	CLD_C3_140(751),
	CLD_C3_141(752),
	CLD_C3_142(753),
	CLD_C3_143(754),
	CLD_C3_144(755),
	CLD_C3_145(756),
	CLD_C3_146(757),
	CLD_C3_147(758),
	CLD_C3_148(759),
	CLD_C3_149(760),
	CLD_C3_150(761),

	CLLC_C1_1(762),
	CLLC_C1_2(763),
	CLLC_C1_3(764),
	CLLC_C1_4(765),
	CLLC_C1_5(766),
	CLLC_C1_6(767),
	CLLC_C1_7(768),
	CLLC_C1_8(769),
	CLLC_C1_9(770),
	CLLC_C1_10(771),
	CLLC_C1_11(772),
	CLLC_C1_12(773),
	CLLC_C1_13(774),
	CLLC_C1_14(775),
	CLLC_C1_15(776),
	CLLC_C1_16(777),
	CLLC_C1_17(778),
	CLLC_C1_18(779),
	CLLC_C1_19(780),
	CLLC_C1_20(781),
	CLLC_C1_21(782),
	CLLC_C1_22(783),
	CLLC_C1_23(784),
	CLLC_C1_24(785),
	CLLC_C1_25(786),
	CLLC_C1_26(787),
	CLLC_C1_27(788),
	CLLC_C1_28(789),
	CLLC_C1_29(790),
	CLLC_C1_30(791),
	CLLC_C1_31(792),
	CLLC_C1_32(793),
	CLLC_C1_33(794),
	CLLC_C1_34(795),
	CLLC_C1_35(796),
	CLLC_C1_36(797),
	CLLC_C1_37(798),
	CLLC_C1_38(799),
	CLLC_C1_39(800),
	CLLC_C1_40(801),
	CLLC_C1_41(802),
	CLLC_C1_42(803),
	CLLC_C1_43(804),
	CLLC_C1_44(805),
	CLLC_C1_45(806),
	CLLC_C1_46(807),
	CLLC_C1_47(808),
	CLLC_C1_48(809),
	CLLC_C1_49(810),
	CLLC_C1_50(811),
	CLLC_C1_51(812),
	CLLC_C1_52(813),
	CLLC_C1_53(814),
	CLLC_C1_54(815),
	CLLC_C1_55(816),
	CLLC_C1_56(817),
	CLLC_C1_57(818),
	CLLC_C1_58(819),
	CLLC_C1_59(820),
	CLLC_C1_60(821),
	CLLC_C1_61(822),
	CLLC_C1_62(823),
	CLLC_C1_63(824),
	CLLC_C1_64(825),
	CLLC_C1_65(826),
	CLLC_C1_66(827),
	CLLC_C1_67(828),
	CLLC_C1_68(829),
	CLLC_C1_69(830),
	CLLC_C1_70(831),
	CLLC_C1_71(832),
	CLLC_C1_72(833),
	CLLC_C1_73(834),
	CLLC_C1_74(835),
	CLLC_C1_75(836),
	CLLC_C1_76(837),
	CLLC_C1_77(838),
	CLLC_C1_78(839),
	CLLC_C1_79(840),
	CLLC_C1_80(841),
	CLLC_C1_81(842),
	CLLC_C1_82(843),
	CLLC_C1_83(844),
	CLLC_C1_84(845),
	CLLC_C1_85(846),
	CLLC_C1_86(847),
	CLLC_C1_87(848),
	CLLC_C1_88(849),
	CLLC_C1_89(850),
	CLLC_C1_90(851),
	CLLC_C1_91(852),
	CLLC_C1_92(853),
	CLLC_C1_93(854),
	CLLC_C1_94(855),
	CLLC_C1_95(856),
	CLLC_C1_96(857),
	CLLC_C1_97(858),
	CLLC_C1_98(859),
	CLLC_C1_99(860),
	CLLC_C1_100(861),
	CLLC_C1_101(862),
	CLLC_C1_102(863),
	CLLC_C1_103(864),
	CLLC_C1_104(865),
	CLLC_C1_105(866),
	CLLC_C1_106(867),
	CLLC_C1_107(868),
	CLLC_C1_108(869),
	CLLC_C1_109(870),
	CLLC_C1_110(871),
	CLLC_C1_111(872),
	CLLC_C1_112(873),
	CLLC_C1_113(874),
	CLLC_C1_114(875),
	CLLC_C1_115(876),
	CLLC_C1_116(877),
	CLLC_C1_117(878),
	CLLC_C1_118(879),
	CLLC_C1_119(880),
	CLLC_C1_120(881),
	CLLC_C1_121(882),
	CLLC_C1_122(883),
	CLLC_C1_123(884),
	CLLC_C1_124(885),
	CLLC_C1_125(886),
	CLLC_C1_126(887),
	CLLC_C1_127(888),
	CLLC_C1_128(889),
	CLLC_C1_129(890),
	CLLC_C1_130(891),
	CLLC_C1_131(892),
	CLLC_C1_132(893),
	CLLC_C1_133(894),
	CLLC_C1_134(895),
	CLLC_C1_135(896),
	CLLC_C1_136(897),
	CLLC_C1_137(898),
	CLLC_C1_138(899),
	CLLC_C1_139(900),
	CLLC_C1_140(901),
	CLLC_C1_141(902),
	CLLC_C1_142(903),
	CLLC_C1_143(904),
	CLLC_C1_144(905),
	CLLC_C1_145(906),
	CLLC_C1_146(907),
	CLLC_C1_147(908),
	CLLC_C1_148(909),
	CLLC_C1_149(910),
	CLLC_C1_150(911),

	CLI_Last(911);

	private final int id;

	public static LedId byOrdinal(int ordinal)
	{
		return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
	}
}
