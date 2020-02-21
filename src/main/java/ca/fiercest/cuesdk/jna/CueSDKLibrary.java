package ca.fiercest.cuesdk.jna;

import ca.fiercest.cuesdk.jna.CorsairProtocolDetails.ByValue;
import com.sun.jna.*;

import java.io.File;
import java.io.IOException;

/**
 * JNA Wrapper for library <b>CueSDK</b><br>
 */
public interface CueSDKLibrary extends Library
{
	public static final String JNA_LIBRARY_NAME = "CueSDK";
	public static final CueSDKLibrary INSTANCE = LoadInstance();

	/**
	 * Load the CueSDKLibrary instance from JNA.
	 * @return CueSDKLibrary Library.
	 */
	static CueSDKLibrary LoadInstance()
	{
		try
		{
			File f = Native.extractFromResourcePath("CueSDK");
			System.setProperty("jna.library.path", f.getAbsolutePath());
			return Native.loadLibrary(JNA_LIBRARY_NAME, CueSDKLibrary.class);
		}
		catch (IOException e)
		{
			System.out.println("Fatal Error: Could not load CueSDKLibrary .dll");
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:3</i><br>
	 * enum values
	 */
	public static interface CorsairLedId
	{
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:5</i> */
		public static final int CLI_Invalid = 0;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:6</i> */
		public static final int CLK_Escape = 1;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:7</i> */
		public static final int CLK_F1 = 2;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:8</i> */
		public static final int CLK_F2 = 3;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:9</i> */
		public static final int CLK_F3 = 4;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:10</i> */
		public static final int CLK_F4 = 5;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:11</i> */
		public static final int CLK_F5 = 6;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:12</i> */
		public static final int CLK_F6 = 7;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:13</i> */
		public static final int CLK_F7 = 8;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:14</i> */
		public static final int CLK_F8 = 9;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:15</i> */
		public static final int CLK_F9 = 10;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:16</i> */
		public static final int CLK_F10 = 11;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:17</i> */
		public static final int CLK_F11 = 12;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:18</i> */
		public static final int CLK_GraveAccentAndTilde = 13;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:19</i> */
		public static final int CLK_1 = 14;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:20</i> */
		public static final int CLK_2 = 15;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:21</i> */
		public static final int CLK_3 = 16;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:22</i> */
		public static final int CLK_4 = 17;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:23</i> */
		public static final int CLK_5 = 18;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:24</i> */
		public static final int CLK_6 = 19;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:25</i> */
		public static final int CLK_7 = 20;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:26</i> */
		public static final int CLK_8 = 21;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:27</i> */
		public static final int CLK_9 = 22;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:28</i> */
		public static final int CLK_0 = 23;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:29</i> */
		public static final int CLK_MinusAndUnderscore = 24;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:30</i> */
		public static final int CLK_Tab = 25;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:31</i> */
		public static final int CLK_Q = 26;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:32</i> */
		public static final int CLK_W = 27;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:33</i> */
		public static final int CLK_E = 28;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:34</i> */
		public static final int CLK_R = 29;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:35</i> */
		public static final int CLK_T = 30;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:36</i> */
		public static final int CLK_Y = 31;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:37</i> */
		public static final int CLK_U = 32;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:38</i> */
		public static final int CLK_I = 33;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:39</i> */
		public static final int CLK_O = 34;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:40</i> */
		public static final int CLK_P = 35;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:41</i> */
		public static final int CLK_BracketLeft = 36;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:42</i> */
		public static final int CLK_CapsLock = 37;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:43</i> */
		public static final int CLK_A = 38;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:44</i> */
		public static final int CLK_S = 39;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:45</i> */
		public static final int CLK_D = 40;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:46</i> */
		public static final int CLK_F = 41;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:47</i> */
		public static final int CLK_G = 42;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:48</i> */
		public static final int CLK_H = 43;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:49</i> */
		public static final int CLK_J = 44;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:50</i> */
		public static final int CLK_K = 45;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:51</i> */
		public static final int CLK_L = 46;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:52</i> */
		public static final int CLK_SemicolonAndColon = 47;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:53</i> */
		public static final int CLK_ApostropheAndDoubleQuote = 48;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:54</i> */
		public static final int CLK_LeftShift = 49;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:55</i> */
		public static final int CLK_NonUsBackslash = 50;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:56</i> */
		public static final int CLK_Z = 51;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:57</i> */
		public static final int CLK_X = 52;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:58</i> */
		public static final int CLK_C = 53;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:59</i> */
		public static final int CLK_V = 54;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:60</i> */
		public static final int CLK_B = 55;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:61</i> */
		public static final int CLK_N = 56;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:62</i> */
		public static final int CLK_M = 57;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:63</i> */
		public static final int CLK_CommaAndLessThan = 58;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:64</i> */
		public static final int CLK_PeriodAndBiggerThan = 59;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:65</i> */
		public static final int CLK_SlashAndQuestionMark = 60;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:66</i> */
		public static final int CLK_LeftCtrl = 61;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:67</i> */
		public static final int CLK_LeftGui = 62;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:68</i> */
		public static final int CLK_LeftAlt = 63;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:69</i> */
		public static final int CLK_Lang2 = 64;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:70</i> */
		public static final int CLK_Space = 65;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:71</i> */
		public static final int CLK_Lang1 = 66;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:72</i> */
		public static final int CLK_International2 = 67;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:73</i> */
		public static final int CLK_RightAlt = 68;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:74</i> */
		public static final int CLK_RightGui = 69;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:75</i> */
		public static final int CLK_Application = 70;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:76</i> */
		public static final int CLK_LedProgramming = 71;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:77</i> */
		public static final int CLK_Brightness = 72;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:78</i> */
		public static final int CLK_F12 = 73;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:79</i> */
		public static final int CLK_PrintScreen = 74;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:80</i> */
		public static final int CLK_ScrollLock = 75;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:81</i> */
		public static final int CLK_PauseBreak = 76;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:82</i> */
		public static final int CLK_Insert = 77;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:83</i> */
		public static final int CLK_Home = 78;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:84</i> */
		public static final int CLK_PageUp = 79;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:85</i> */
		public static final int CLK_BracketRight = 80;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:86</i> */
		public static final int CLK_Backslash = 81;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:87</i> */
		public static final int CLK_NonUsTilde = 82;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:88</i> */
		public static final int CLK_Enter = 83;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:89</i> */
		public static final int CLK_International1 = 84;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:90</i> */
		public static final int CLK_EqualsAndPlus = 85;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:91</i> */
		public static final int CLK_International3 = 86;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:92</i> */
		public static final int CLK_Backspace = 87;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:93</i> */
		public static final int CLK_Delete = 88;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:94</i> */
		public static final int CLK_End = 89;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:95</i> */
		public static final int CLK_PageDown = 90;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:96</i> */
		public static final int CLK_RightShift = 91;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:97</i> */
		public static final int CLK_RightCtrl = 92;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:98</i> */
		public static final int CLK_UpArrow = 93;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:99</i> */
		public static final int CLK_LeftArrow = 94;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:100</i> */
		public static final int CLK_DownArrow = 95;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:101</i> */
		public static final int CLK_RightArrow = 96;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:102</i> */
		public static final int CLK_WinLock = 97;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:103</i> */
		public static final int CLK_Mute = 98;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:104</i> */
		public static final int CLK_Stop = 99;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:105</i> */
		public static final int CLK_ScanPreviousTrack = 100;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:106</i> */
		public static final int CLK_PlayPause = 101;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:107</i> */
		public static final int CLK_ScanNextTrack = 102;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:108</i> */
		public static final int CLK_NumLock = 103;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:109</i> */
		public static final int CLK_KeypadSlash = 104;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:110</i> */
		public static final int CLK_KeypadAsterisk = 105;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:111</i> */
		public static final int CLK_KeypadMinus = 106;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:112</i> */
		public static final int CLK_KeypadPlus = 107;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:113</i> */
		public static final int CLK_KeypadEnter = 108;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:114</i> */
		public static final int CLK_Keypad7 = 109;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:115</i> */
		public static final int CLK_Keypad8 = 110;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:116</i> */
		public static final int CLK_Keypad9 = 111;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:117</i> */
		public static final int CLK_KeypadComma = 112;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:118</i> */
		public static final int CLK_Keypad4 = 113;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:119</i> */
		public static final int CLK_Keypad5 = 114;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:120</i> */
		public static final int CLK_Keypad6 = 115;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:121</i> */
		public static final int CLK_Keypad1 = 116;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:122</i> */
		public static final int CLK_Keypad2 = 117;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:123</i> */
		public static final int CLK_Keypad3 = 118;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:124</i> */
		public static final int CLK_Keypad0 = 119;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:125</i> */
		public static final int CLK_KeypadPeriodAndDelete = 120;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:126</i> */
		public static final int CLK_G1 = 121;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:127</i> */
		public static final int CLK_G2 = 122;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:128</i> */
		public static final int CLK_G3 = 123;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:129</i> */
		public static final int CLK_G4 = 124;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:130</i> */
		public static final int CLK_G5 = 125;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:131</i> */
		public static final int CLK_G6 = 126;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:132</i> */
		public static final int CLK_G7 = 127;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:133</i> */
		public static final int CLK_G8 = 128;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:134</i> */
		public static final int CLK_G9 = 129;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:135</i> */
		public static final int CLK_G10 = 130;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:136</i> */
		public static final int CLK_VolumeUp = 131;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:137</i> */
		public static final int CLK_VolumeDown = 132;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:138</i> */
		public static final int CLK_MR = 133;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:139</i> */
		public static final int CLK_M1 = 134;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:140</i> */
		public static final int CLK_M2 = 135;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:141</i> */
		public static final int CLK_M3 = 136;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:142</i> */
		public static final int CLK_G11 = 137;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:143</i> */
		public static final int CLK_G12 = 138;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:144</i> */
		public static final int CLK_G13 = 139;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:145</i> */
		public static final int CLK_G14 = 140;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:146</i> */
		public static final int CLK_G15 = 141;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:147</i> */
		public static final int CLK_G16 = 142;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:148</i> */
		public static final int CLK_G17 = 143;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:149</i> */
		public static final int CLK_G18 = 144;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:150</i> */
		public static final int CLK_International5 = 145;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:151</i> */
		public static final int CLK_International4 = 146;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:152</i> */
		public static final int CLK_Fn = 147;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:154</i> */
		public static final int CLM_1 = 148;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:155</i> */
		public static final int CLM_2 = 149;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:156</i> */
		public static final int CLM_3 = 150;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:157</i> */
		public static final int CLM_4 = 151;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:159</i> */
		public static final int CLH_LeftLogo = 152;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:160</i> */
		public static final int CLH_RightLogo = 153;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:162</i> */
		public static final int CLK_Logo = 154;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:164</i> */
		public static final int CLMM_Zone1 = 155;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:165</i> */
		public static final int CLMM_Zone2 = 156;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:166</i> */
		public static final int CLMM_Zone3 = 157;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:167</i> */
		public static final int CLMM_Zone4 = 158;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:168</i> */
		public static final int CLMM_Zone5 = 159;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:169</i> */
		public static final int CLMM_Zone6 = 160;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:170</i> */
		public static final int CLMM_Zone7 = 161;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:171</i> */
		public static final int CLMM_Zone8 = 162;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:172</i> */
		public static final int CLMM_Zone9 = 163;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:173</i> */
		public static final int CLMM_Zone10 = 164;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:174</i> */
		public static final int CLMM_Zone11 = 165;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:175</i> */
		public static final int CLMM_Zone12 = 166;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:176</i> */
		public static final int CLMM_Zone13 = 167;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:177</i> */
		public static final int CLMM_Zone14 = 168;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:178</i> */
		public static final int CLMM_Zone15 = 169;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:180</i> */
		public static final int CLKLP_Zone1 = 170;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:181</i> */
		public static final int CLKLP_Zone2 = 171;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:182</i> */
		public static final int CLKLP_Zone3 = 172;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:183</i> */
		public static final int CLKLP_Zone4 = 173;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:184</i> */
		public static final int CLKLP_Zone5 = 174;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:185</i> */
		public static final int CLKLP_Zone6 = 175;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:186</i> */
		public static final int CLKLP_Zone7 = 176;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:187</i> */
		public static final int CLKLP_Zone8 = 177;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:188</i> */
		public static final int CLKLP_Zone9 = 178;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:189</i> */
		public static final int CLKLP_Zone10 = 179;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:190</i> */
		public static final int CLKLP_Zone11 = 180;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:191</i> */
		public static final int CLKLP_Zone12 = 181;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:192</i> */
		public static final int CLKLP_Zone13 = 182;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:193</i> */
		public static final int CLKLP_Zone14 = 183;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:194</i> */
		public static final int CLKLP_Zone15 = 184;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:195</i> */
		public static final int CLKLP_Zone16 = 185;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:196</i> */
		public static final int CLKLP_Zone17 = 186;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:197</i> */
		public static final int CLKLP_Zone18 = 187;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:198</i> */
		public static final int CLKLP_Zone19 = 188;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:200</i> */
		public static final int CLM_5 = 189;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:201</i> */
		public static final int CLM_6 = 190;
		/** <i>native declaration : target\CUESDK\include\CorsairLedIdEnum.h:203</i> */
		public static final int CLI_Last = (int) CueSDKLibrary.CorsairLedId.CLM_6;
	};

	/**
	 * contains list of available device types<br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:3</i><br>
	 * enum values
	 */
	public static interface CorsairDeviceType
	{
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:5</i> */
		public static final int CDT_Unknown = 0;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:6</i> */
		public static final int CDT_Mouse = 1;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:7</i> */
		public static final int CDT_Keyboard = 2;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:8</i> */
		public static final int CDT_Headset = 3;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:9</i> */
		public static final int CDT_MouseMat = 4;
	};

	/**
	 * contains list of available physical layouts for keyboards<br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:12</i><br>
	 * enum values
	 */
	public static interface CorsairPhysicalLayout
	{
		/**
		 * dummy value<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:14</i>
		 */
		public static final int CPL_Invalid = 0;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:16</i> */
		public static final int CPL_US = 1;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:17</i> */
		public static final int CPL_UK = 2;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:18</i> */
		public static final int CPL_BR = 3;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:19</i> */
		public static final int CPL_JP = 4;
		/**
		 * valid values for keyboard<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:20</i>
		 */
		public static final int CPL_KR = 5;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:22</i> */
		public static final int CPL_Zones1 = 6;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:23</i> */
		public static final int CPL_Zones2 = 7;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:24</i> */
		public static final int CPL_Zones3 = 8;
		/**
		 * valid values for mouse<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:25</i>
		 */
		public static final int CPL_Zones4 = 9;
	};

	/**
	 * contains list of available logical layouts for keyboards<br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:28</i><br>
	 * enum values
	 */
	public static interface CorsairLogicalLayout
	{
		/**
		 * dummy value<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:30</i>
		 */
		public static final int CLL_Invalid = 0;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:31</i> */
		public static final int CLL_US_Int = 1;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:32</i> */
		public static final int CLL_NA = 2;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:33</i> */
		public static final int CLL_EU = 3;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:34</i> */
		public static final int CLL_UK = 4;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:35</i> */
		public static final int CLL_BE = 5;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:36</i> */
		public static final int CLL_BR = 6;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:37</i> */
		public static final int CLL_CH = 7;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:38</i> */
		public static final int CLL_CN = 8;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:39</i> */
		public static final int CLL_DE = 9;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:40</i> */
		public static final int CLL_ES = 10;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:41</i> */
		public static final int CLL_FR = 11;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:42</i> */
		public static final int CLL_IT = 12;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:43</i> */
		public static final int CLL_ND = 13;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:44</i> */
		public static final int CLL_RU = 14;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:45</i> */
		public static final int CLL_JP = 15;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:46</i> */
		public static final int CLL_KR = 16;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:47</i> */
		public static final int CLL_TW = 17;
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:48</i> */
		public static final int CLL_MEX = 18;
	};

	/**
	 * contains list of device capabilities<br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:51</i><br>
	 * enum values
	 */
	public static interface CorsairDeviceCaps
	{
		/**
		 * for devices that do not support any SDK functions<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:53</i>
		 */
		public static final int CDC_None = 0;
		/**
		 * for devices that has controlled lighting<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:54</i>
		 */
		public static final int CDC_Lighting = 1;
	};

	/**
	 * contains list of available SDK access modes<br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:57</i><br>
	 * enum values
	 */
	public static interface CorsairAccessMode
	{
		/** <i>native declaration : target\CUESDK\include\CUESDK.h:59</i> */
		public static final int CAM_ExclusiveLightingControl = 0;
	};

	/**
	 * contains shared list of all errors which could happen during calling of Corsair* functions<br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:62</i><br>
	 * enum values
	 */
	public static interface CorsairError
	{
		/**
		 * if previously called function completed successfully<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:64</i>
		 */
		public static final int CE_Success = 0;
		/**
		 * CUE is not running or was shut down or third-party control is disabled in CUE settings(runtime error)<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:65</i>
		 */
		public static final int CE_ServerNotFound = 1;
		/**
		 * if some other client has or took over exclusive control (runtime error)<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:66</i>
		 */
		public static final int CE_NoControl = 2;
		/**
		 * if developer did not perform protocol handshake(developer error)<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:67</i>
		 */
		public static final int CE_ProtocolHandshakeMissing = 3;
		/**
		 * if developer is calling the function that is not supported by the server(either because protocol has broken by server or client or because the function is new and server is too old. Check CorsairProtocolDetails for details) (developer error)<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:68</i>
		 */
		public static final int CE_IncompatibleProtocol = 4;
		/**
		 * if developer supplied invalid arguments to the function(for specifics look at function descriptions). (developer error)<br>
		 * <i>native declaration : target\CUESDK\include\CUESDK.h:69</i>
		 */
		public static final int CE_InvalidArguments = 5;
	};

	/** <i>native declaration : target\CUESDK\include\CUESDK.h:119</i> */
	public interface CorsairSetLedsColorsAsync_CallbackType_callback extends Callback
	{
		void apply(Pointer voidPtr1, byte bool1, int CorsairError1);
	};

	/**
	 * Original signature : <code>bool CorsairSetLedsColors(int, CorsairLedColor*)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:117</i>
	 */
	byte CorsairSetLedsColors(int size, CorsairLedColor ledsColors);

	/**
	 * Original signature : <code>bool CorsairSetLedsColorsAsync(int, CorsairLedColor*, CorsairSetLedsColorsAsync_CallbackType_callback*, void*)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:119</i>
	 */
	byte CorsairSetLedsColorsAsync(int size, CorsairLedColor ledsColors, CueSDKLibrary.CorsairSetLedsColorsAsync_CallbackType_callback CallbackType, Pointer context);

	/**
	 * Original signature : <code>int CorsairGetDeviceCount()</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:122</i>
	 */
	int CorsairGetDeviceCount();

	/**
	 * Original signature : <code>CorsairDeviceInfo* CorsairGetDeviceInfo(int)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:125</i>
	 */
	CorsairDeviceInfo CorsairGetDeviceInfo(int deviceIndex);

	/**
	 * Original signature : <code>CorsairLedPositions* CorsairGetLedPositions()</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:128</i>
	 */
	CorsairLedPositions CorsairGetLedPositions();

	/**
	 * Original signature : <code>CorsairLedPositions* CorsairGetLedPositionsByDeviceIndex(int)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:131</i>
	 */
	CorsairLedPositions CorsairGetLedPositionsByDeviceIndex(int deviceIndex);

	/**
	 * Original signature : <code>CorsairLedId CorsairGetLedIdForKeyName(char)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:134</i>
	 */
	int CorsairGetLedIdForKeyName(byte keyName);

	/**
	 * Original signature : <code>bool CorsairRequestControl(CorsairAccessMode)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:137</i>
	 */
	byte CorsairRequestControl(int accessMode);

	/**
	 * Original signature : <code>CorsairProtocolDetails CorsairPerformProtocolHandshake()</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:140</i>
	 */
	ByValue CorsairPerformProtocolHandshake();

	/**
	 * Original signature : <code>CorsairError CorsairGetLastError()</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:143</i>
	 */
	int CorsairGetLastError();

	/**
	 * Original signature : <code>bool CorsairReleaseControl(CorsairAccessMode)</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:146</i>
	 */
	byte CorsairReleaseControl(int accessMode);

	/**
	 * Original signature : <code>bool CorsairGetLedsColors(int size, CorsairLedColor* ledsColors);</code><br>
	 * <i>native declaration : target\CUESDK\include\CUESDK.h:173</i>
	 */
	byte CorsairGetLedsColors(int size, CorsairLedColor ledsColors);
}
