package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Scheme UUID
 */
public class SchemeUUID {

    @SuppressWarnings("serial")
    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(UUID.fromString("00000002-0000-1000-8000-00805f9b34fb"), "aaa:");
            put(UUID.fromString("00000003-0000-1000-8000-00805f9b34fb"), "aaas:");
            put(UUID.fromString("00000004-0000-1000-8000-00805f9b34fb"), "about:");
            put(UUID.fromString("00000005-0000-1000-8000-00805f9b34fb"), "acap:");
            put(UUID.fromString("00000006-0000-1000-8000-00805f9b34fb"), "acct:");
            put(UUID.fromString("00000007-0000-1000-8000-00805f9b34fb"), "cap:");
            put(UUID.fromString("00000008-0000-1000-8000-00805f9b34fb"), "cid:");
            put(UUID.fromString("00000009-0000-1000-8000-00805f9b34fb"), "coap:");
            put(UUID.fromString("0000000a-0000-1000-8000-00805f9b34fb"), "coaps:");
            put(UUID.fromString("0000000b-0000-1000-8000-00805f9b34fb"), "crid:");
            put(UUID.fromString("0000000c-0000-1000-8000-00805f9b34fb"), "data:");
            put(UUID.fromString("0000000d-0000-1000-8000-00805f9b34fb"), "dav:");
            put(UUID.fromString("0000000e-0000-1000-8000-00805f9b34fb"), "dict:");
            put(UUID.fromString("0000000f-0000-1000-8000-00805f9b34fb"), "dns:");
            put(UUID.fromString("00000010-0000-1000-8000-00805f9b34fb"), "file:");
            put(UUID.fromString("00000011-0000-1000-8000-00805f9b34fb"), "ftp:");
            put(UUID.fromString("00000012-0000-1000-8000-00805f9b34fb"), "geo:");
            put(UUID.fromString("00000013-0000-1000-8000-00805f9b34fb"), "go:");
            put(UUID.fromString("00000014-0000-1000-8000-00805f9b34fb"), "gopher:");
            put(UUID.fromString("00000015-0000-1000-8000-00805f9b34fb"), "h323:");
            put(UUID.fromString("00000016-0000-1000-8000-00805f9b34fb"), "http:");
            put(UUID.fromString("00000017-0000-1000-8000-00805f9b34fb"), "https:");
            put(UUID.fromString("00000018-0000-1000-8000-00805f9b34fb"), "iax:");
            put(UUID.fromString("00000019-0000-1000-8000-00805f9b34fb"), "icap:");
            put(UUID.fromString("0000001a-0000-1000-8000-00805f9b34fb"), "im:");
            put(UUID.fromString("0000001b-0000-1000-8000-00805f9b34fb"), "imap:");
            put(UUID.fromString("0000001c-0000-1000-8000-00805f9b34fb"), "info:");
            put(UUID.fromString("0000001d-0000-1000-8000-00805f9b34fb"), "ipp:");
            put(UUID.fromString("0000001e-0000-1000-8000-00805f9b34fb"), "ipps:");
            put(UUID.fromString("0000001f-0000-1000-8000-00805f9b34fb"), "iris:");
            put(UUID.fromString("00000020-0000-1000-8000-00805f9b34fb"), "iris.beep:");
            put(UUID.fromString("00000021-0000-1000-8000-00805f9b34fb"), "iris.xpc:");
            put(UUID.fromString("00000022-0000-1000-8000-00805f9b34fb"), "iris.xpcs:");
            put(UUID.fromString("00000023-0000-1000-8000-00805f9b34fb"), "iris.lwz:");
            put(UUID.fromString("00000024-0000-1000-8000-00805f9b34fb"), "jabber:");
            put(UUID.fromString("00000025-0000-1000-8000-00805f9b34fb"), "ldap:");
            put(UUID.fromString("00000026-0000-1000-8000-00805f9b34fb"), "mailto:");
            put(UUID.fromString("00000027-0000-1000-8000-00805f9b34fb"), "mid:");
            put(UUID.fromString("00000028-0000-1000-8000-00805f9b34fb"), "msrp:");
            put(UUID.fromString("00000029-0000-1000-8000-00805f9b34fb"), "msrps:");
            put(UUID.fromString("0000002a-0000-1000-8000-00805f9b34fb"), "mtqp:");
            put(UUID.fromString("0000002b-0000-1000-8000-00805f9b34fb"), "mupdate:");
            put(UUID.fromString("0000002c-0000-1000-8000-00805f9b34fb"), "news:");
            put(UUID.fromString("0000002d-0000-1000-8000-00805f9b34fb"), "nfs:");
            put(UUID.fromString("0000002e-0000-1000-8000-00805f9b34fb"), "ni:");
            put(UUID.fromString("0000002f-0000-1000-8000-00805f9b34fb"), "nih:");
            put(UUID.fromString("00000030-0000-1000-8000-00805f9b34fb"), "nntp:");
            put(UUID.fromString("00000031-0000-1000-8000-00805f9b34fb"), "opaquelocktoken:");
            put(UUID.fromString("00000032-0000-1000-8000-00805f9b34fb"), "pop:");
            put(UUID.fromString("00000033-0000-1000-8000-00805f9b34fb"), "pres:");
            put(UUID.fromString("00000034-0000-1000-8000-00805f9b34fb"), "reload:");
            put(UUID.fromString("00000035-0000-1000-8000-00805f9b34fb"), "rtsp:");
            put(UUID.fromString("00000036-0000-1000-8000-00805f9b34fb"), "rtsps:");
            put(UUID.fromString("00000037-0000-1000-8000-00805f9b34fb"), "rtspu:");
            put(UUID.fromString("00000038-0000-1000-8000-00805f9b34fb"), "service:");
            put(UUID.fromString("00000039-0000-1000-8000-00805f9b34fb"), "session:");
            put(UUID.fromString("0000003a-0000-1000-8000-00805f9b34fb"), "shttp:");
            put(UUID.fromString("0000003b-0000-1000-8000-00805f9b34fb"), "sieve:");
            put(UUID.fromString("0000003c-0000-1000-8000-00805f9b34fb"), "sip:");
            put(UUID.fromString("0000003d-0000-1000-8000-00805f9b34fb"), "sips:");
            put(UUID.fromString("0000003e-0000-1000-8000-00805f9b34fb"), "sms:");
            put(UUID.fromString("0000003f-0000-1000-8000-00805f9b34fb"), "snmp:");
            put(UUID.fromString("00000040-0000-1000-8000-00805f9b34fb"), "soap.beep:");
            put(UUID.fromString("00000041-0000-1000-8000-00805f9b34fb"), "soap.beeps:");
            put(UUID.fromString("00000042-0000-1000-8000-00805f9b34fb"), "stun:");
            put(UUID.fromString("00000043-0000-1000-8000-00805f9b34fb"), "stuns:");
            put(UUID.fromString("00000044-0000-1000-8000-00805f9b34fb"), "tag:");
            put(UUID.fromString("00000045-0000-1000-8000-00805f9b34fb"), "tel:");
            put(UUID.fromString("00000046-0000-1000-8000-00805f9b34fb"), "telnet:");
            put(UUID.fromString("00000047-0000-1000-8000-00805f9b34fb"), "tftp:");
            put(UUID.fromString("00000048-0000-1000-8000-00805f9b34fb"), "thismessage:");
            put(UUID.fromString("00000049-0000-1000-8000-00805f9b34fb"), "tn3270:");
            put(UUID.fromString("0000004a-0000-1000-8000-00805f9b34fb"), "tip:");
            put(UUID.fromString("0000004b-0000-1000-8000-00805f9b34fb"), "turn:");
            put(UUID.fromString("0000004c-0000-1000-8000-00805f9b34fb"), "turns:");
            put(UUID.fromString("0000004d-0000-1000-8000-00805f9b34fb"), "tv:");
            put(UUID.fromString("0000004e-0000-1000-8000-00805f9b34fb"), "urn:");
            put(UUID.fromString("0000004f-0000-1000-8000-00805f9b34fb"), "vemmi:");
            put(UUID.fromString("00000050-0000-1000-8000-00805f9b34fb"), "ws:");
            put(UUID.fromString("00000051-0000-1000-8000-00805f9b34fb"), "wss:");
            put(UUID.fromString("00000052-0000-1000-8000-00805f9b34fb"), "xcon:");
            put(UUID.fromString("00000053-0000-1000-8000-00805f9b34fb"), "xcon-userid:");
            put(UUID.fromString("00000054-0000-1000-8000-00805f9b34fb"), "xmlrpc.beep:");
            put(UUID.fromString("00000055-0000-1000-8000-00805f9b34fb"), "xmlrpc.beeps:");
            put(UUID.fromString("00000056-0000-1000-8000-00805f9b34fb"), "xmpp:");
            put(UUID.fromString("00000057-0000-1000-8000-00805f9b34fb"), "z39.50r:");
            put(UUID.fromString("00000058-0000-1000-8000-00805f9b34fb"), "z39.50s:");
            put(UUID.fromString("00000059-0000-1000-8000-00805f9b34fb"), "acr:");
            put(UUID.fromString("0000005a-0000-1000-8000-00805f9b34fb"), "adiumxtra:");
            put(UUID.fromString("0000005b-0000-1000-8000-00805f9b34fb"), "afp:");
            put(UUID.fromString("0000005c-0000-1000-8000-00805f9b34fb"), "afs:");
            put(UUID.fromString("0000005d-0000-1000-8000-00805f9b34fb"), "aim:");
            put(UUID.fromString("0000005e-0000-1000-8000-00805f9b34fb"), "apt:");
            put(UUID.fromString("0000005f-0000-1000-8000-00805f9b34fb"), "attachment:");
            put(UUID.fromString("00000060-0000-1000-8000-00805f9b34fb"), "aw:");
            put(UUID.fromString("00000061-0000-1000-8000-00805f9b34fb"), "barion:");
            put(UUID.fromString("00000062-0000-1000-8000-00805f9b34fb"), "beshare:");
            put(UUID.fromString("00000063-0000-1000-8000-00805f9b34fb"), "bitcoin:");
            put(UUID.fromString("00000064-0000-1000-8000-00805f9b34fb"), "bolo:");
            put(UUID.fromString("00000065-0000-1000-8000-00805f9b34fb"), "callto:");
            put(UUID.fromString("00000066-0000-1000-8000-00805f9b34fb"), "chrome:");
            put(UUID.fromString("00000067-0000-1000-8000-00805f9b34fb"), "chrome-extension:");
            put(UUID.fromString("00000068-0000-1000-8000-00805f9b34fb"), "com-eventbrite-attendee:");
            put(UUID.fromString("00000069-0000-1000-8000-00805f9b34fb"), "content:");
            put(UUID.fromString("0000006a-0000-1000-8000-00805f9b34fb"), "cvs:");
            put(UUID.fromString("0000006b-0000-1000-8000-00805f9b34fb"), "dlna-playsingle:");
            put(UUID.fromString("0000006c-0000-1000-8000-00805f9b34fb"), "dlna-playcontainer:");
            put(UUID.fromString("0000006d-0000-1000-8000-00805f9b34fb"), "dtn:");
            put(UUID.fromString("0000006e-0000-1000-8000-00805f9b34fb"), "dvb:");
            put(UUID.fromString("0000006f-0000-1000-8000-00805f9b34fb"), "ed2k:");
            put(UUID.fromString("00000070-0000-1000-8000-00805f9b34fb"), "facetime:");
            put(UUID.fromString("00000071-0000-1000-8000-00805f9b34fb"), "feed:");
            put(UUID.fromString("00000072-0000-1000-8000-00805f9b34fb"), "feedready:");
            put(UUID.fromString("00000073-0000-1000-8000-00805f9b34fb"), "finger:");
            put(UUID.fromString("00000074-0000-1000-8000-00805f9b34fb"), "fish:");
            put(UUID.fromString("00000075-0000-1000-8000-00805f9b34fb"), "gg:");
            put(UUID.fromString("00000076-0000-1000-8000-00805f9b34fb"), "git:");
            put(UUID.fromString("00000077-0000-1000-8000-00805f9b34fb"), "gizmoproject:");
            put(UUID.fromString("00000078-0000-1000-8000-00805f9b34fb"), "gtalk:");
            put(UUID.fromString("00000079-0000-1000-8000-00805f9b34fb"), "ham:");
            put(UUID.fromString("0000007a-0000-1000-8000-00805f9b34fb"), "hcp:");
            put(UUID.fromString("0000007b-0000-1000-8000-00805f9b34fb"), "icon:");
            put(UUID.fromString("0000007c-0000-1000-8000-00805f9b34fb"), "ipn:");
            put(UUID.fromString("0000007d-0000-1000-8000-00805f9b34fb"), "irc:");
            put(UUID.fromString("0000007e-0000-1000-8000-00805f9b34fb"), "irc6:");
            put(UUID.fromString("0000007f-0000-1000-8000-00805f9b34fb"), "ircs:");
            put(UUID.fromString("00000080-0000-1000-8000-00805f9b34fb"), "itms:");
            put(UUID.fromString("00000081-0000-1000-8000-00805f9b34fb"), "jar:");
            put(UUID.fromString("00000082-0000-1000-8000-00805f9b34fb"), "jms:");
            put(UUID.fromString("00000083-0000-1000-8000-00805f9b34fb"), "keyparc:");
            put(UUID.fromString("00000084-0000-1000-8000-00805f9b34fb"), "lastfm:");
            put(UUID.fromString("00000085-0000-1000-8000-00805f9b34fb"), "ldaps:");
            put(UUID.fromString("00000086-0000-1000-8000-00805f9b34fb"), "magnet:");
            put(UUID.fromString("00000087-0000-1000-8000-00805f9b34fb"), "maps:");
            put(UUID.fromString("00000088-0000-1000-8000-00805f9b34fb"), "market:");
            put(UUID.fromString("00000089-0000-1000-8000-00805f9b34fb"), "message:");
            put(UUID.fromString("0000008a-0000-1000-8000-00805f9b34fb"), "mms:");
            put(UUID.fromString("0000008b-0000-1000-8000-00805f9b34fb"), "ms-help:");
            put(UUID.fromString("0000008c-0000-1000-8000-00805f9b34fb"), "ms-settings-power:");
            put(UUID.fromString("0000008d-0000-1000-8000-00805f9b34fb"), "msnim:");
            put(UUID.fromString("0000008e-0000-1000-8000-00805f9b34fb"), "mumble:");
            put(UUID.fromString("0000008f-0000-1000-8000-00805f9b34fb"), "mvn:");
            put(UUID.fromString("00000090-0000-1000-8000-00805f9b34fb"), "notes:");
            put(UUID.fromString("00000091-0000-1000-8000-00805f9b34fb"), "oid:");
            put(UUID.fromString("00000092-0000-1000-8000-00805f9b34fb"), "palm:");
            put(UUID.fromString("00000093-0000-1000-8000-00805f9b34fb"), "paparazzi:");
            put(UUID.fromString("00000094-0000-1000-8000-00805f9b34fb"), "pkcs11:");
            put(UUID.fromString("00000095-0000-1000-8000-00805f9b34fb"), "platform:");
            put(UUID.fromString("00000096-0000-1000-8000-00805f9b34fb"), "proxy:");
            put(UUID.fromString("00000097-0000-1000-8000-00805f9b34fb"), "psyc:");
            put(UUID.fromString("00000098-0000-1000-8000-00805f9b34fb"), "query:");
            put(UUID.fromString("00000099-0000-1000-8000-00805f9b34fb"), "res:");
            put(UUID.fromString("0000009a-0000-1000-8000-00805f9b34fb"), "resource:");
            put(UUID.fromString("0000009b-0000-1000-8000-00805f9b34fb"), "rmi:");
            put(UUID.fromString("0000009c-0000-1000-8000-00805f9b34fb"), "rsync:");
            put(UUID.fromString("0000009d-0000-1000-8000-00805f9b34fb"), "rtmfp:");
            put(UUID.fromString("0000009e-0000-1000-8000-00805f9b34fb"), "rtmp:");
            put(UUID.fromString("0000009f-0000-1000-8000-00805f9b34fb"), "secondlife:");
            put(UUID.fromString("000000a0-0000-1000-8000-00805f9b34fb"), "sftp:");
            put(UUID.fromString("000000a1-0000-1000-8000-00805f9b34fb"), "sgn:");
            put(UUID.fromString("000000a2-0000-1000-8000-00805f9b34fb"), "skype:");
            put(UUID.fromString("000000a3-0000-1000-8000-00805f9b34fb"), "smb:");
            put(UUID.fromString("000000a4-0000-1000-8000-00805f9b34fb"), "smtp:");
            put(UUID.fromString("000000a5-0000-1000-8000-00805f9b34fb"), "soldat:");
            put(UUID.fromString("000000a6-0000-1000-8000-00805f9b34fb"), "spotify:");
            put(UUID.fromString("000000a7-0000-1000-8000-00805f9b34fb"), "ssh:");
            put(UUID.fromString("000000a8-0000-1000-8000-00805f9b34fb"), "steam:");
            put(UUID.fromString("000000a9-0000-1000-8000-00805f9b34fb"), "submit:");
            put(UUID.fromString("000000aa-0000-1000-8000-00805f9b34fb"), "svn:");
            put(UUID.fromString("000000ab-0000-1000-8000-00805f9b34fb"), "teamspeak:");
            put(UUID.fromString("000000ac-0000-1000-8000-00805f9b34fb"), "teliaeid:");
            put(UUID.fromString("000000ad-0000-1000-8000-00805f9b34fb"), "things:");
            put(UUID.fromString("000000ae-0000-1000-8000-00805f9b34fb"), "udp:");
            put(UUID.fromString("000000af-0000-1000-8000-00805f9b34fb"), "unreal:");
            put(UUID.fromString("000000b0-0000-1000-8000-00805f9b34fb"), "ut2004:");
            put(UUID.fromString("000000b1-0000-1000-8000-00805f9b34fb"), "ventrilo:");
            put(UUID.fromString("000000b2-0000-1000-8000-00805f9b34fb"), "view-source:");
            put(UUID.fromString("000000b3-0000-1000-8000-00805f9b34fb"), "webcal:");
            put(UUID.fromString("000000b4-0000-1000-8000-00805f9b34fb"), "wtai:");
            put(UUID.fromString("000000b5-0000-1000-8000-00805f9b34fb"), "wyciwyg:");
            put(UUID.fromString("000000b6-0000-1000-8000-00805f9b34fb"), "xfire:");
            put(UUID.fromString("000000b7-0000-1000-8000-00805f9b34fb"), "xri:");
            put(UUID.fromString("000000b8-0000-1000-8000-00805f9b34fb"), "ymsgr:");
            put(UUID.fromString("000000b9-0000-1000-8000-00805f9b34fb"), "example:");
            put(UUID.fromString("000000ba-0000-1000-8000-00805f9b34fb"), "ms-settings-cloudstorage:");
        }
    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> SCHEME_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

    /**
     * aaa: (Scheme UUID: 0x0002)
     */
    public static final UUID AAA_SCHEME = UUID.fromString("00000002-0000-1000-8000-00805f9b34fb");

    /**
     * aaas: (Scheme UUID: 0x0003)
     */
    public static final UUID AAAS_SCHEME = UUID.fromString("00000003-0000-1000-8000-00805f9b34fb");

    /**
     * about: (Scheme UUID: 0x0004)
     */
    public static final UUID ABOUT_SCHEME = UUID.fromString("00000004-0000-1000-8000-00805f9b34fb");

    /**
     * acap: (Scheme UUID: 0x0005)
     */
    public static final UUID ACAP_SCHEME = UUID.fromString("00000005-0000-1000-8000-00805f9b34fb");

    /**
     * acct: (Scheme UUID: 0x0006)
     */
    public static final UUID ACCT_SCHEME = UUID.fromString("00000006-0000-1000-8000-00805f9b34fb");

    /**
     * cap: (Scheme UUID: 0x0007)
     */
    public static final UUID CAP_SCHEME = UUID.fromString("00000007-0000-1000-8000-00805f9b34fb");

    /**
     * cid: (Scheme UUID: 0x0008)
     */
    public static final UUID CID_SCHEME = UUID.fromString("00000008-0000-1000-8000-00805f9b34fb");

    /**
     * coap: (Scheme UUID: 0x0009)
     */
    public static final UUID COAP_SCHEME = UUID.fromString("00000009-0000-1000-8000-00805f9b34fb");

    /**
     * coaps: (Scheme UUID: 0x000a)
     */
    public static final UUID COAPS_SCHEME = UUID.fromString("0000000a-0000-1000-8000-00805f9b34fb");

    /**
     * crid: (Scheme UUID: 0x000b)
     */
    public static final UUID CRID_SCHEME = UUID.fromString("0000000b-0000-1000-8000-00805f9b34fb");

    /**
     * data: (Scheme UUID: 0x000c)
     */
    public static final UUID DATA_SCHEME = UUID.fromString("0000000c-0000-1000-8000-00805f9b34fb");

    /**
     * dav: (Scheme UUID: 0x000d)
     */
    public static final UUID DAV_SCHEME = UUID.fromString("0000000d-0000-1000-8000-00805f9b34fb");

    /**
     * dict: (Scheme UUID: 0x000e)
     */
    public static final UUID DICT_SCHEME = UUID.fromString("0000000e-0000-1000-8000-00805f9b34fb");

    /**
     * dns: (Scheme UUID: 0x000f)
     */
    public static final UUID DNS_SCHEME = UUID.fromString("0000000f-0000-1000-8000-00805f9b34fb");

    /**
     * file: (Scheme UUID: 0x0010)
     */
    public static final UUID FILE_SCHEME = UUID.fromString("00000010-0000-1000-8000-00805f9b34fb");

    /**
     * ftp: (Scheme UUID: 0x0011)
     */
    public static final UUID FTP_SCHEME = UUID.fromString("00000011-0000-1000-8000-00805f9b34fb");

    /**
     * geo: (Scheme UUID: 0x0012)
     */
    public static final UUID GEO_SCHEME = UUID.fromString("00000012-0000-1000-8000-00805f9b34fb");

    /**
     * go: (Scheme UUID: 0x0013)
     */
    public static final UUID GO_SCHEME = UUID.fromString("00000013-0000-1000-8000-00805f9b34fb");

    /**
     * gopher: (Scheme UUID: 0x0014)
     */
    public static final UUID GOPHER_SCHEME = UUID.fromString("00000014-0000-1000-8000-00805f9b34fb");

    /**
     * h323: (Scheme UUID: 0x0015)
     */
    public static final UUID H323_SCHEME = UUID.fromString("00000015-0000-1000-8000-00805f9b34fb");

    /**
     * http: (Scheme UUID: 0x0016)
     */
    public static final UUID HTTP_SCHEME = UUID.fromString("00000016-0000-1000-8000-00805f9b34fb");

    /**
     * https: (Scheme UUID: 0x0017)
     */
    public static final UUID HTTPS_SCHEME = UUID.fromString("00000017-0000-1000-8000-00805f9b34fb");

    /**
     * iax: (Scheme UUID: 0x0018)
     */
    public static final UUID IAX_SCHEME = UUID.fromString("00000018-0000-1000-8000-00805f9b34fb");

    /**
     * icap: (Scheme UUID: 0x0019)
     */
    public static final UUID ICAP_SCHEME = UUID.fromString("00000019-0000-1000-8000-00805f9b34fb");

    /**
     * im: (Scheme UUID: 0x001a)
     */
    public static final UUID IM_SCHEME = UUID.fromString("0000001a-0000-1000-8000-00805f9b34fb");

    /**
     * imap: (Scheme UUID: 0x001b)
     */
    public static final UUID IMAP_SCHEME = UUID.fromString("0000001b-0000-1000-8000-00805f9b34fb");

    /**
     * info: (Scheme UUID: 0x001c)
     */
    public static final UUID INFO_SCHEME = UUID.fromString("0000001c-0000-1000-8000-00805f9b34fb");

    /**
     * ipp: (Scheme UUID: 0x001d)
     */
    public static final UUID IPP_SCHEME = UUID.fromString("0000001d-0000-1000-8000-00805f9b34fb");

    /**
     * ipps: (Scheme UUID: 0x001e)
     */
    public static final UUID IPPS_SCHEME = UUID.fromString("0000001e-0000-1000-8000-00805f9b34fb");

    /**
     * iris: (Scheme UUID: 0x001f)
     */
    public static final UUID IRIS_SCHEME = UUID.fromString("0000001f-0000-1000-8000-00805f9b34fb");

    /**
     * iris.beep: (Scheme UUID: 0x0020)
     */
    public static final UUID IRIS_BEEP_SCHEME = UUID.fromString("00000020-0000-1000-8000-00805f9b34fb");

    /**
     * iris.xpc: (Scheme UUID: 0x0021)
     */
    public static final UUID IRIS_XPC_SCHEME = UUID.fromString("00000021-0000-1000-8000-00805f9b34fb");

    /**
     * iris.xpcs: (Scheme UUID: 0x0022)
     */
    public static final UUID IRIS_XPCS_SCHEME = UUID.fromString("00000022-0000-1000-8000-00805f9b34fb");

    /**
     * iris.lwz: (Scheme UUID: 0x0023)
     */
    public static final UUID IRIS_LWZ_SCHEME = UUID.fromString("00000023-0000-1000-8000-00805f9b34fb");

    /**
     * jabber: (Scheme UUID: 0x0024)
     */
    public static final UUID JABBER_SCHEME = UUID.fromString("00000024-0000-1000-8000-00805f9b34fb");

    /**
     * ldap: (Scheme UUID: 0x0025)
     */
    public static final UUID LDAP_SCHEME = UUID.fromString("00000025-0000-1000-8000-00805f9b34fb");

    /**
     * mailto: (Scheme UUID: 0x0026)
     */
    public static final UUID MAILTO_SCHEME = UUID.fromString("00000026-0000-1000-8000-00805f9b34fb");

    /**
     * mid: (Scheme UUID: 0x0027)
     */
    public static final UUID MID_SCHEME = UUID.fromString("00000027-0000-1000-8000-00805f9b34fb");

    /**
     * msrp: (Scheme UUID: 0x0028)
     */
    public static final UUID MSRP_SCHEME = UUID.fromString("00000028-0000-1000-8000-00805f9b34fb");

    /**
     * msrps: (Scheme UUID: 0x0029)
     */
    public static final UUID MSRPS_SCHEME = UUID.fromString("00000029-0000-1000-8000-00805f9b34fb");

    /**
     * mtqp: (Scheme UUID: 0x002a)
     */
    public static final UUID MTQP_SCHEME = UUID.fromString("0000002a-0000-1000-8000-00805f9b34fb");

    /**
     * mupdate: (Scheme UUID: 0x002b)
     */
    public static final UUID MUPDATE_SCHEME = UUID.fromString("0000002b-0000-1000-8000-00805f9b34fb");

    /**
     * news: (Scheme UUID: 0x002c)
     */
    public static final UUID NEWS_SCHEME = UUID.fromString("0000002c-0000-1000-8000-00805f9b34fb");

    /**
     * nfs: (Scheme UUID: 0x002d)
     */
    public static final UUID NFS_SCHEME = UUID.fromString("0000002d-0000-1000-8000-00805f9b34fb");

    /**
     * ni: (Scheme UUID: 0x002e)
     */
    public static final UUID NI_SCHEME = UUID.fromString("0000002e-0000-1000-8000-00805f9b34fb");

    /**
     * nih: (Scheme UUID: 0x002f)
     */
    public static final UUID NIH_SCHEME = UUID.fromString("0000002f-0000-1000-8000-00805f9b34fb");

    /**
     * nntp: (Scheme UUID: 0x0030)
     */
    public static final UUID NNTP_SCHEME = UUID.fromString("00000030-0000-1000-8000-00805f9b34fb");

    /**
     * opaquelocktoken: (Scheme UUID: 0x0031)
     */
    public static final UUID OPAQUELOCKTOKEN_SCHEME = UUID.fromString("00000031-0000-1000-8000-00805f9b34fb");

    /**
     * pop: (Scheme UUID: 0x0032)
     */
    public static final UUID POP_SCHEME = UUID.fromString("00000032-0000-1000-8000-00805f9b34fb");

    /**
     * pres: (Scheme UUID: 0x0033)
     */
    public static final UUID PRES_SCHEME = UUID.fromString("00000033-0000-1000-8000-00805f9b34fb");

    /**
     * reload: (Scheme UUID: 0x0034)
     */
    public static final UUID RELOAD_SCHEME = UUID.fromString("00000034-0000-1000-8000-00805f9b34fb");

    /**
     * rtsp: (Scheme UUID: 0x0035)
     */
    public static final UUID RTSP_SCHEME = UUID.fromString("00000035-0000-1000-8000-00805f9b34fb");

    /**
     * rtsps: (Scheme UUID: 0x0036)
     */
    public static final UUID RTSPS_SCHEME = UUID.fromString("00000036-0000-1000-8000-00805f9b34fb");

    /**
     * rtspu: (Scheme UUID: 0x0037)
     */
    public static final UUID RTSPU_SCHEME = UUID.fromString("00000037-0000-1000-8000-00805f9b34fb");

    /**
     * service: (Scheme UUID: 0x0038)
     */
    public static final UUID SERVICE_SCHEME = UUID.fromString("00000038-0000-1000-8000-00805f9b34fb");

    /**
     * session: (Scheme UUID: 0x0039)
     */
    public static final UUID SESSION_SCHEME = UUID.fromString("00000039-0000-1000-8000-00805f9b34fb");

    /**
     * shttp: (Scheme UUID: 0x003a)
     */
    public static final UUID SHTTP_SCHEME = UUID.fromString("0000003a-0000-1000-8000-00805f9b34fb");

    /**
     * sieve: (Scheme UUID: 0x003b)
     */
    public static final UUID SIEVE_SCHEME = UUID.fromString("0000003b-0000-1000-8000-00805f9b34fb");

    /**
     * sip: (Scheme UUID: 0x003c)
     */
    public static final UUID SIP_SCHEME = UUID.fromString("0000003c-0000-1000-8000-00805f9b34fb");

    /**
     * sips: (Scheme UUID: 0x003d)
     */
    public static final UUID SIPS_SCHEME = UUID.fromString("0000003d-0000-1000-8000-00805f9b34fb");

    /**
     * sms: (Scheme UUID: 0x003e)
     */
    public static final UUID SMS_SCHEME = UUID.fromString("0000003e-0000-1000-8000-00805f9b34fb");

    /**
     * snmp: (Scheme UUID: 0x003f)
     */
    public static final UUID SNMP_SCHEME = UUID.fromString("0000003f-0000-1000-8000-00805f9b34fb");

    /**
     * soap.beep: (Scheme UUID: 0x0040)
     */
    public static final UUID SOAP_BEEP_SCHEME = UUID.fromString("00000040-0000-1000-8000-00805f9b34fb");

    /**
     * soap.beeps: (Scheme UUID: 0x0041)
     */
    public static final UUID SOAP_BEEPS_SCHEME = UUID.fromString("00000041-0000-1000-8000-00805f9b34fb");

    /**
     * stun: (Scheme UUID: 0x0042)
     */
    public static final UUID STUN_SCHEME = UUID.fromString("00000042-0000-1000-8000-00805f9b34fb");

    /**
     * stuns: (Scheme UUID: 0x0043)
     */
    public static final UUID STUNS_SCHEME = UUID.fromString("00000043-0000-1000-8000-00805f9b34fb");

    /**
     * tag: (Scheme UUID: 0x0044)
     */
    public static final UUID TAG_SCHEME = UUID.fromString("00000044-0000-1000-8000-00805f9b34fb");

    /**
     * tel: (Scheme UUID: 0x0045)
     */
    public static final UUID TEL_SCHEME = UUID.fromString("00000045-0000-1000-8000-00805f9b34fb");

    /**
     * telnet: (Scheme UUID: 0x0046)
     */
    public static final UUID TELNET_SCHEME = UUID.fromString("00000046-0000-1000-8000-00805f9b34fb");

    /**
     * tftp: (Scheme UUID: 0x0047)
     */
    public static final UUID TFTP_SCHEME = UUID.fromString("00000047-0000-1000-8000-00805f9b34fb");

    /**
     * thismessage: (Scheme UUID: 0x0048)
     */
    public static final UUID THISMESSAGE_SCHEME = UUID.fromString("00000048-0000-1000-8000-00805f9b34fb");

    /**
     * tn3270: (Scheme UUID: 0x0049)
     */
    public static final UUID TN3270_SCHEME = UUID.fromString("00000049-0000-1000-8000-00805f9b34fb");

    /**
     * tip: (Scheme UUID: 0x004a)
     */
    public static final UUID TIP_SCHEME = UUID.fromString("0000004a-0000-1000-8000-00805f9b34fb");

    /**
     * turn: (Scheme UUID: 0x004b)
     */
    public static final UUID TURN_SCHEME = UUID.fromString("0000004b-0000-1000-8000-00805f9b34fb");

    /**
     * turns: (Scheme UUID: 0x004c)
     */
    public static final UUID TURNS_SCHEME = UUID.fromString("0000004c-0000-1000-8000-00805f9b34fb");

    /**
     * tv: (Scheme UUID: 0x004d)
     */
    public static final UUID TV_SCHEME = UUID.fromString("0000004d-0000-1000-8000-00805f9b34fb");

    /**
     * urn: (Scheme UUID: 0x004e)
     */
    public static final UUID URN_SCHEME = UUID.fromString("0000004e-0000-1000-8000-00805f9b34fb");

    /**
     * vemmi: (Scheme UUID: 0x004f)
     */
    public static final UUID VEMMI_SCHEME = UUID.fromString("0000004f-0000-1000-8000-00805f9b34fb");

    /**
     * ws: (Scheme UUID: 0x0050)
     */
    public static final UUID WS_SCHEME = UUID.fromString("00000050-0000-1000-8000-00805f9b34fb");

    /**
     * wss: (Scheme UUID: 0x0051)
     */
    public static final UUID WSS_SCHEME = UUID.fromString("00000051-0000-1000-8000-00805f9b34fb");

    /**
     * xcon: (Scheme UUID: 0x0052)
     */
    public static final UUID XCON_SCHEME = UUID.fromString("00000052-0000-1000-8000-00805f9b34fb");

    /**
     * xcon-userid: (Scheme UUID: 0x0053)
     */
    public static final UUID XCON_USERID_SCHEME = UUID.fromString("00000053-0000-1000-8000-00805f9b34fb");

    /**
     * xmlrpc.beep: (Scheme UUID: 0x0054)
     */
    public static final UUID XMLRPC_BEEP_SCHEME = UUID.fromString("00000054-0000-1000-8000-00805f9b34fb");

    /**
     * xmlrpc.beeps: (Scheme UUID: 0x0055)
     */
    public static final UUID XMLRPC_BEEPS_SCHEME = UUID.fromString("00000055-0000-1000-8000-00805f9b34fb");

    /**
     * xmpp: (Scheme UUID: 0x0056)
     */
    public static final UUID XMPP_SCHEME = UUID.fromString("00000056-0000-1000-8000-00805f9b34fb");

    /**
     * z39.50r: (Scheme UUID: 0x0057)
     */
    public static final UUID Z39_50R_SCHEME = UUID.fromString("00000057-0000-1000-8000-00805f9b34fb");

    /**
     * z39.50s: (Scheme UUID: 0x0058)
     */
    public static final UUID Z39_50S_SCHEME = UUID.fromString("00000058-0000-1000-8000-00805f9b34fb");

    /**
     * acr: (Scheme UUID: 0x0059)
     */
    public static final UUID ACR_SCHEME = UUID.fromString("00000059-0000-1000-8000-00805f9b34fb");

    /**
     * adiumxtra: (Scheme UUID: 0x005a)
     */
    public static final UUID ADIUMXTRA_SCHEME = UUID.fromString("0000005a-0000-1000-8000-00805f9b34fb");

    /**
     * afp: (Scheme UUID: 0x005b)
     */
    public static final UUID AFP_SCHEME = UUID.fromString("0000005b-0000-1000-8000-00805f9b34fb");

    /**
     * afs: (Scheme UUID: 0x005c)
     */
    public static final UUID AFS_SCHEME = UUID.fromString("0000005c-0000-1000-8000-00805f9b34fb");

    /**
     * aim: (Scheme UUID: 0x005d)
     */
    public static final UUID AIM_SCHEME = UUID.fromString("0000005d-0000-1000-8000-00805f9b34fb");

    /**
     * apt: (Scheme UUID: 0x005e)
     */
    public static final UUID APT_SCHEME = UUID.fromString("0000005e-0000-1000-8000-00805f9b34fb");

    /**
     * attachment: (Scheme UUID: 0x005f)
     */
    public static final UUID ATTACHMENT_SCHEME = UUID.fromString("0000005f-0000-1000-8000-00805f9b34fb");

    /**
     * aw: (Scheme UUID: 0x0060)
     */
    public static final UUID AW_SCHEME = UUID.fromString("00000060-0000-1000-8000-00805f9b34fb");

    /**
     * barion: (Scheme UUID: 0x0061)
     */
    public static final UUID BARION_SCHEME = UUID.fromString("00000061-0000-1000-8000-00805f9b34fb");

    /**
     * beshare: (Scheme UUID: 0x0062)
     */
    public static final UUID BESHARE_SCHEME = UUID.fromString("00000062-0000-1000-8000-00805f9b34fb");

    /**
     * bitcoin: (Scheme UUID: 0x0063)
     */
    public static final UUID BITCOIN_SCHEME = UUID.fromString("00000063-0000-1000-8000-00805f9b34fb");

    /**
     * bolo: (Scheme UUID: 0x0064)
     */
    public static final UUID BOLO_SCHEME = UUID.fromString("00000064-0000-1000-8000-00805f9b34fb");

    /**
     * callto: (Scheme UUID: 0x0065)
     */
    public static final UUID CALLTO_SCHEME = UUID.fromString("00000065-0000-1000-8000-00805f9b34fb");

    /**
     * chrome: (Scheme UUID: 0x0066)
     */
    public static final UUID CHROME_SCHEME = UUID.fromString("00000066-0000-1000-8000-00805f9b34fb");

    /**
     * chrome-extension: (Scheme UUID: 0x0067)
     */
    public static final UUID CHROME_EXTENSION_SCHEME = UUID.fromString("00000067-0000-1000-8000-00805f9b34fb");

    /**
     * com-eventbrite-attendee: (Scheme UUID: 0x0068)
     */
    public static final UUID COM_EVENTBRITE_ATTENDEE_SCHEME = UUID.fromString("00000068-0000-1000-8000-00805f9b34fb");

    /**
     * content: (Scheme UUID: 0x0069)
     */
    public static final UUID CONTENT_SCHEME = UUID.fromString("00000069-0000-1000-8000-00805f9b34fb");

    /**
     * cvs: (Scheme UUID: 0x006a)
     */
    public static final UUID CVS_SCHEME = UUID.fromString("0000006a-0000-1000-8000-00805f9b34fb");

    /**
     * dlna-playsingle: (Scheme UUID: 0x006b)
     */
    public static final UUID DLNA_PLAYSINGLE_SCHEME = UUID.fromString("0000006b-0000-1000-8000-00805f9b34fb");

    /**
     * dlna-playcontainer: (Scheme UUID: 0x006c)
     */
    public static final UUID DLNA_PLAYCONTAINER_SCHEME = UUID.fromString("0000006c-0000-1000-8000-00805f9b34fb");

    /**
     * dtn: (Scheme UUID: 0x006d)
     */
    public static final UUID DTN_SCHEME = UUID.fromString("0000006d-0000-1000-8000-00805f9b34fb");

    /**
     * dvb: (Scheme UUID: 0x006e)
     */
    public static final UUID DVB_SCHEME = UUID.fromString("0000006e-0000-1000-8000-00805f9b34fb");

    /**
     * ed2k: (Scheme UUID: 0x006f)
     */
    public static final UUID ED2K_SCHEME = UUID.fromString("0000006f-0000-1000-8000-00805f9b34fb");

    /**
     * facetime: (Scheme UUID: 0x0070)
     */
    public static final UUID FACETIME_SCHEME = UUID.fromString("00000070-0000-1000-8000-00805f9b34fb");

    /**
     * feed: (Scheme UUID: 0x0071)
     */
    public static final UUID FEED_SCHEME = UUID.fromString("00000071-0000-1000-8000-00805f9b34fb");

    /**
     * feedready: (Scheme UUID: 0x0072)
     */
    public static final UUID FEEDREADY_SCHEME = UUID.fromString("00000072-0000-1000-8000-00805f9b34fb");

    /**
     * finger: (Scheme UUID: 0x0073)
     */
    public static final UUID FINGER_SCHEME = UUID.fromString("00000073-0000-1000-8000-00805f9b34fb");

    /**
     * fish: (Scheme UUID: 0x0074)
     */
    public static final UUID FISH_SCHEME = UUID.fromString("00000074-0000-1000-8000-00805f9b34fb");

    /**
     * gg: (Scheme UUID: 0x0075)
     */
    public static final UUID GG_SCHEME = UUID.fromString("00000075-0000-1000-8000-00805f9b34fb");

    /**
     * git: (Scheme UUID: 0x0076)
     */
    public static final UUID GIT_SCHEME = UUID.fromString("00000076-0000-1000-8000-00805f9b34fb");

    /**
     * gizmoproject: (Scheme UUID: 0x0077)
     */
    public static final UUID GIZMOPROJECT_SCHEME = UUID.fromString("00000077-0000-1000-8000-00805f9b34fb");

    /**
     * gtalk: (Scheme UUID: 0x0078)
     */
    public static final UUID GTALK_SCHEME = UUID.fromString("00000078-0000-1000-8000-00805f9b34fb");

    /**
     * ham: (Scheme UUID: 0x0079)
     */
    public static final UUID HAM_SCHEME = UUID.fromString("00000079-0000-1000-8000-00805f9b34fb");

    /**
     * hcp: (Scheme UUID: 0x007a)
     */
    public static final UUID HCP_SCHEME = UUID.fromString("0000007a-0000-1000-8000-00805f9b34fb");

    /**
     * icon: (Scheme UUID: 0x007b)
     */
    public static final UUID ICON_SCHEME = UUID.fromString("0000007b-0000-1000-8000-00805f9b34fb");

    /**
     * ipn: (Scheme UUID: 0x007c)
     */
    public static final UUID IPN_SCHEME = UUID.fromString("0000007c-0000-1000-8000-00805f9b34fb");

    /**
     * irc: (Scheme UUID: 0x007d)
     */
    public static final UUID IRC_SCHEME = UUID.fromString("0000007d-0000-1000-8000-00805f9b34fb");

    /**
     * irc6: (Scheme UUID: 0x007e)
     */
    public static final UUID IRC6_SCHEME = UUID.fromString("0000007e-0000-1000-8000-00805f9b34fb");

    /**
     * ircs: (Scheme UUID: 0x007f)
     */
    public static final UUID IRCS_SCHEME = UUID.fromString("0000007f-0000-1000-8000-00805f9b34fb");

    /**
     * itms: (Scheme UUID: 0x0080)
     */
    public static final UUID ITMS_SCHEME = UUID.fromString("00000080-0000-1000-8000-00805f9b34fb");

    /**
     * jar: (Scheme UUID: 0x0081)
     */
    public static final UUID JAR_SCHEME = UUID.fromString("00000081-0000-1000-8000-00805f9b34fb");

    /**
     * jms: (Scheme UUID: 0x0082)
     */
    public static final UUID JMS_SCHEME = UUID.fromString("00000082-0000-1000-8000-00805f9b34fb");

    /**
     * keyparc: (Scheme UUID: 0x0083)
     */
    public static final UUID KEYPARC_SCHEME = UUID.fromString("00000083-0000-1000-8000-00805f9b34fb");

    /**
     * lastfm: (Scheme UUID: 0x0084)
     */
    public static final UUID LASTFM_SCHEME = UUID.fromString("00000084-0000-1000-8000-00805f9b34fb");

    /**
     * ldaps: (Scheme UUID: 0x0085)
     */
    public static final UUID LDAPS_SCHEME = UUID.fromString("00000085-0000-1000-8000-00805f9b34fb");

    /**
     * magnet: (Scheme UUID: 0x0086)
     */
    public static final UUID MAGNET_SCHEME = UUID.fromString("00000086-0000-1000-8000-00805f9b34fb");

    /**
     * maps: (Scheme UUID: 0x0087)
     */
    public static final UUID MAPS_SCHEME = UUID.fromString("00000087-0000-1000-8000-00805f9b34fb");

    /**
     * market: (Scheme UUID: 0x0088)
     */
    public static final UUID MARKET_SCHEME = UUID.fromString("00000088-0000-1000-8000-00805f9b34fb");

    /**
     * message: (Scheme UUID: 0x0089)
     */
    public static final UUID MESSAGE_SCHEME = UUID.fromString("00000089-0000-1000-8000-00805f9b34fb");

    /**
     * mms: (Scheme UUID: 0x008a)
     */
    public static final UUID MMS_SCHEME = UUID.fromString("0000008a-0000-1000-8000-00805f9b34fb");

    /**
     * ms-help: (Scheme UUID: 0x008b)
     */
    public static final UUID MS_HELP_SCHEME = UUID.fromString("0000008b-0000-1000-8000-00805f9b34fb");

    /**
     * ms-settings-power: (Scheme UUID: 0x008c)
     */
    public static final UUID MS_SETTINGS_POWER_SCHEME = UUID.fromString("0000008c-0000-1000-8000-00805f9b34fb");

    /**
     * msnim: (Scheme UUID: 0x008d)
     */
    public static final UUID MSNIM_SCHEME = UUID.fromString("0000008d-0000-1000-8000-00805f9b34fb");

    /**
     * mumble: (Scheme UUID: 0x008e)
     */
    public static final UUID MUMBLE_SCHEME = UUID.fromString("0000008e-0000-1000-8000-00805f9b34fb");

    /**
     * mvn: (Scheme UUID: 0x008f)
     */
    public static final UUID MVN_SCHEME = UUID.fromString("0000008f-0000-1000-8000-00805f9b34fb");

    /**
     * notes: (Scheme UUID: 0x0090)
     */
    public static final UUID NOTES_SCHEME = UUID.fromString("00000090-0000-1000-8000-00805f9b34fb");

    /**
     * oid: (Scheme UUID: 0x0091)
     */
    public static final UUID OID_SCHEME = UUID.fromString("00000091-0000-1000-8000-00805f9b34fb");

    /**
     * palm: (Scheme UUID: 0x0092)
     */
    public static final UUID PALM_SCHEME = UUID.fromString("00000092-0000-1000-8000-00805f9b34fb");

    /**
     * paparazzi: (Scheme UUID: 0x0093)
     */
    public static final UUID PAPARAZZI_SCHEME = UUID.fromString("00000093-0000-1000-8000-00805f9b34fb");

    /**
     * pkcs11: (Scheme UUID: 0x0094)
     */
    public static final UUID PKCS11_SCHEME = UUID.fromString("00000094-0000-1000-8000-00805f9b34fb");

    /**
     * platform: (Scheme UUID: 0x0095)
     */
    public static final UUID PLATFORM_SCHEME = UUID.fromString("00000095-0000-1000-8000-00805f9b34fb");

    /**
     * proxy: (Scheme UUID: 0x0096)
     */
    public static final UUID PROXY_SCHEME = UUID.fromString("00000096-0000-1000-8000-00805f9b34fb");

    /**
     * psyc: (Scheme UUID: 0x0097)
     */
    public static final UUID PSYC_SCHEME = UUID.fromString("00000097-0000-1000-8000-00805f9b34fb");

    /**
     * query: (Scheme UUID: 0x0098)
     */
    public static final UUID QUERY_SCHEME = UUID.fromString("00000098-0000-1000-8000-00805f9b34fb");

    /**
     * res: (Scheme UUID: 0x0099)
     */
    public static final UUID RES_SCHEME = UUID.fromString("00000099-0000-1000-8000-00805f9b34fb");

    /**
     * resource: (Scheme UUID: 0x009a)
     */
    public static final UUID RESOURCE_SCHEME = UUID.fromString("0000009a-0000-1000-8000-00805f9b34fb");

    /**
     * rmi: (Scheme UUID: 0x009b)
     */
    public static final UUID RMI_SCHEME = UUID.fromString("0000009b-0000-1000-8000-00805f9b34fb");

    /**
     * rsync: (Scheme UUID: 0x009c)
     */
    public static final UUID RSYNC_SCHEME = UUID.fromString("0000009c-0000-1000-8000-00805f9b34fb");

    /**
     * rtmfp: (Scheme UUID: 0x009d)
     */
    public static final UUID RTMFP_SCHEME = UUID.fromString("0000009d-0000-1000-8000-00805f9b34fb");

    /**
     * rtmp: (Scheme UUID: 0x009e)
     */
    public static final UUID RTMP_SCHEME = UUID.fromString("0000009e-0000-1000-8000-00805f9b34fb");

    /**
     * secondlife: (Scheme UUID: 0x009f)
     */
    public static final UUID SECONDLIFE_SCHEME = UUID.fromString("0000009f-0000-1000-8000-00805f9b34fb");

    /**
     * sftp: (Scheme UUID: 0x00a0)
     */
    public static final UUID SFTP_SCHEME = UUID.fromString("000000a0-0000-1000-8000-00805f9b34fb");

    /**
     * sgn: (Scheme UUID: 0x00a1)
     */
    public static final UUID SGN_SCHEME = UUID.fromString("000000a1-0000-1000-8000-00805f9b34fb");

    /**
     * skype: (Scheme UUID: 0x00a2)
     */
    public static final UUID SKYPE_SCHEME = UUID.fromString("000000a2-0000-1000-8000-00805f9b34fb");

    /**
     * smb: (Scheme UUID: 0x00a3)
     */
    public static final UUID SMB_SCHEME = UUID.fromString("000000a3-0000-1000-8000-00805f9b34fb");

    /**
     * smtp: (Scheme UUID: 0x00a4)
     */
    public static final UUID SMTP_SCHEME = UUID.fromString("000000a4-0000-1000-8000-00805f9b34fb");

    /**
     * soldat: (Scheme UUID: 0x00a5)
     */
    public static final UUID SOLDAT_SCHEME = UUID.fromString("000000a5-0000-1000-8000-00805f9b34fb");

    /**
     * spotify: (Scheme UUID: 0x00a6)
     */
    public static final UUID SPOTIFY_SCHEME = UUID.fromString("000000a6-0000-1000-8000-00805f9b34fb");

    /**
     * ssh: (Scheme UUID: 0x00a7)
     */
    public static final UUID SSH_SCHEME = UUID.fromString("000000a7-0000-1000-8000-00805f9b34fb");

    /**
     * steam: (Scheme UUID: 0x00a8)
     */
    public static final UUID STEAM_SCHEME = UUID.fromString("000000a8-0000-1000-8000-00805f9b34fb");

    /**
     * submit: (Scheme UUID: 0x00a9)
     */
    public static final UUID SUBMIT_SCHEME = UUID.fromString("000000a9-0000-1000-8000-00805f9b34fb");

    /**
     * svn: (Scheme UUID: 0x00aa)
     */
    public static final UUID SVN_SCHEME = UUID.fromString("000000aa-0000-1000-8000-00805f9b34fb");

    /**
     * teamspeak: (Scheme UUID: 0x00ab)
     */
    public static final UUID TEAMSPEAK_SCHEME = UUID.fromString("000000ab-0000-1000-8000-00805f9b34fb");

    /**
     * teliaeid: (Scheme UUID: 0x00ac)
     */
    public static final UUID TELIAEID_SCHEME = UUID.fromString("000000ac-0000-1000-8000-00805f9b34fb");

    /**
     * things: (Scheme UUID: 0x00ad)
     */
    public static final UUID THINGS_SCHEME = UUID.fromString("000000ad-0000-1000-8000-00805f9b34fb");

    /**
     * udp: (Scheme UUID: 0x00ae)
     */
    public static final UUID UDP_SCHEME = UUID.fromString("000000ae-0000-1000-8000-00805f9b34fb");

    /**
     * unreal: (Scheme UUID: 0x00af)
     */
    public static final UUID UNREAL_SCHEME = UUID.fromString("000000af-0000-1000-8000-00805f9b34fb");

    /**
     * ut2004: (Scheme UUID: 0x00b0)
     */
    public static final UUID UT2004_SCHEME = UUID.fromString("000000b0-0000-1000-8000-00805f9b34fb");

    /**
     * ventrilo: (Scheme UUID: 0x00b1)
     */
    public static final UUID VENTRILO_SCHEME = UUID.fromString("000000b1-0000-1000-8000-00805f9b34fb");

    /**
     * view-source: (Scheme UUID: 0x00b2)
     */
    public static final UUID VIEW_SOURCE_SCHEME = UUID.fromString("000000b2-0000-1000-8000-00805f9b34fb");

    /**
     * webcal: (Scheme UUID: 0x00b3)
     */
    public static final UUID WEBCAL_SCHEME = UUID.fromString("000000b3-0000-1000-8000-00805f9b34fb");

    /**
     * wtai: (Scheme UUID: 0x00b4)
     */
    public static final UUID WTAI_SCHEME = UUID.fromString("000000b4-0000-1000-8000-00805f9b34fb");

    /**
     * wyciwyg: (Scheme UUID: 0x00b5)
     */
    public static final UUID WYCIWYG_SCHEME = UUID.fromString("000000b5-0000-1000-8000-00805f9b34fb");

    /**
     * xfire: (Scheme UUID: 0x00b6)
     */
    public static final UUID XFIRE_SCHEME = UUID.fromString("000000b6-0000-1000-8000-00805f9b34fb");

    /**
     * xri: (Scheme UUID: 0x00b7)
     */
    public static final UUID XRI_SCHEME = UUID.fromString("000000b7-0000-1000-8000-00805f9b34fb");

    /**
     * ymsgr: (Scheme UUID: 0x00b8)
     */
    public static final UUID YMSGR_SCHEME = UUID.fromString("000000b8-0000-1000-8000-00805f9b34fb");

    /**
     * example: (Scheme UUID: 0x00b9)
     */
    public static final UUID EXAMPLE_SCHEME = UUID.fromString("000000b9-0000-1000-8000-00805f9b34fb");

    /**
     * ms-settings-cloudstorage: (Scheme UUID: 0x00ba)
     */
    public static final UUID MS_SETTINGS_CLOUDSTORAGE_SCHEME = UUID.fromString("000000ba-0000-1000-8000-00805f9b34fb");

}