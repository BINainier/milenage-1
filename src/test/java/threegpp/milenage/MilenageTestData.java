/*
 * Copyright (c) 2016 Constantin Roganov 
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, 
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or 
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package threegpp.milenage;

import static javax.xml.bind.DatatypeConverter.parseHexBinary;

/**
 * <h1>MilenageTestData</h1>
 * <p>
 * Set of static intermediate and result values for using in test suite
 *
 * @author Constantin Roganov {@literal <rccbox @ gmail . com>}
 * @version 1.0.0
 * @since 05.03.16
 */
public class MilenageTestData {

    /**
     * Common values
     */
    public final static byte [] K = parseHexBinary("465B5CE8B199B49FAA5F0A2EE238A6BC");
    public final static byte [] RAND = parseHexBinary("23553CBE9637A89D218AE64DAE47BF35");
    public final static byte [] OP = parseHexBinary("CDC202D5123E20F62B6D676AC72CB318");
    public final static byte [] OPC = parseHexBinary("CD63CB71954A9F4E48A5994E37A02BAF");
    public final static byte [] SQN = parseHexBinary("FF9BB4D0B607");
    public final static byte [] AMF = parseHexBinary("B9B9");
//    public final static String IN1 = SQN + AMF + SQN + AMF;

    /**
     * Test set 1
     */
    public final static byte [] F1 = parseHexBinary("4A9FFAC354DFAFB3");
    public final static byte [] F1_STAR = parseHexBinary("01CFAF9EC4E871E9");
    public final static byte [] F2 = parseHexBinary("A54211D5E3BA50BF");
    public final static byte [] F3 = parseHexBinary("B40BA9A3C58B2A05BBF0D987B21BF8CB");
    public final static byte [] F4 = parseHexBinary("F769BCD751044604127672711C6D3441");
    public final static byte [] F5 = parseHexBinary("AA689C648370");
    public final static byte [] F5_STAR = parseHexBinary("451E8BECA43B");

    /**
     * Ciphering
     */
    public final static byte [] PLAIN = parseHexBinary("EE36F7CF037D37D3692F7F0399E7949A");
    public final static byte [] CIPHER = parseHexBinary("9E2980C59739DA67B136355E3CEDE6A2");

    /**
     * Test data set with all constants (R and C) customized.
     */
    public final static byte [] F1_C = parseHexBinary("4FEF17668A1B2BD1");
    public final static byte [] F1_STAR_C = parseHexBinary("1F7DB575C5BCC213");
    public final static byte [] F2_C = parseHexBinary("E62ED6A1D8BD9325");
    public final static byte [] F3_C = parseHexBinary("6B4C2FA2E83F66E0C8D6B44165D84B8D");
    public final static byte [] F4_C = parseHexBinary("C1B3127617EFC1F3A2A392B451AB9306");
    public final static byte [] F5_C = parseHexBinary("24E4BE006592");
    public final static byte [] F5_STAR_C = parseHexBinary("B1BF9AD8A2AE");
    public final static byte [] AUTN_C = parseHexBinary("DB7F0AD0D395B9B94FEF17668A1B2BD1");

    public final static byte [] C1_C = parseHexBinary("465b5ce8b199b49faa5f0a2ee238a6bc");
    public final static byte [] C2_C = parseHexBinary("407f3970f1e68def5bb987c1b981217d");
    public final static byte [] C3_C = parseHexBinary("4e82c626bf644bc9e4ddcc085d5ced75");
    public final static byte [] C4_C = parseHexBinary("00d75b6abfb310a35b6edcab063231de");
    public final static byte [] C5_C = parseHexBinary("2b10460594a356a6cfcd8a0dc9ffbbd3");

    public final static byte R1_C = 0x08;
    public final static byte R2_C = 0x13;
    public final static byte R3_C = 0x6A;
    public final static byte R4_C = 0x4A;
    public final static byte R5_C = 0x51;
}
