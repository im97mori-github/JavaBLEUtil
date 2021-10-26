package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * BLE GATT Scheme UUID
 * <p>
 * URI Scheme Name String Mapping.pdf Revision Date: 2021-05-14
 */
public class Scheme {

	@SuppressWarnings("serial")
	private static final class SchemeMap extends HashMap<Character, String> {

		private SchemeMap() {
			super();
			put(Character.valueOf((char) 0x0002), "aaa:");
			put(Character.valueOf((char) 0x0003), "aaas:");
			put(Character.valueOf((char) 0x0004), "about:");
			put(Character.valueOf((char) 0x0005), "acap:");
			put(Character.valueOf((char) 0x0006), "acct:");
			put(Character.valueOf((char) 0x0007), "cap:");
			put(Character.valueOf((char) 0x0008), "cid:");
			put(Character.valueOf((char) 0x0009), "coap:");
			put(Character.valueOf((char) 0x000a), "coaps:");
			put(Character.valueOf((char) 0x000b), "crid:");
			put(Character.valueOf((char) 0x000c), "data:");
			put(Character.valueOf((char) 0x000d), "dav:");
			put(Character.valueOf((char) 0x000e), "dict:");
			put(Character.valueOf((char) 0x000f), "dns:");
			put(Character.valueOf((char) 0x0010), "file:");
			put(Character.valueOf((char) 0x0011), "ftp:");
			put(Character.valueOf((char) 0x0012), "geo:");
			put(Character.valueOf((char) 0x0013), "go:");
			put(Character.valueOf((char) 0x0014), "gopher:");
			put(Character.valueOf((char) 0x0015), "h323:");
			put(Character.valueOf((char) 0x0016), "http:");
			put(Character.valueOf((char) 0x0017), "https:");
			put(Character.valueOf((char) 0x0018), "iax:");
			put(Character.valueOf((char) 0x0019), "icap:");
			put(Character.valueOf((char) 0x001a), "im:");
			put(Character.valueOf((char) 0x001b), "imap:");
			put(Character.valueOf((char) 0x001c), "info:");
			put(Character.valueOf((char) 0x001d), "ipp:");
			put(Character.valueOf((char) 0x001e), "ipps:");
			put(Character.valueOf((char) 0x001f), "iris:");
			put(Character.valueOf((char) 0x0020), "iris.beep:");
			put(Character.valueOf((char) 0x0021), "iris.xpc:");
			put(Character.valueOf((char) 0x0022), "iris.xpcs:");
			put(Character.valueOf((char) 0x0023), "iris.lwz:");
			put(Character.valueOf((char) 0x0024), "jabber:");
			put(Character.valueOf((char) 0x0025), "ldap:");
			put(Character.valueOf((char) 0x0026), "mailto:");
			put(Character.valueOf((char) 0x0027), "mid:");
			put(Character.valueOf((char) 0x0028), "msrp:");
			put(Character.valueOf((char) 0x0029), "msrps:");
			put(Character.valueOf((char) 0x002a), "mtqp:");
			put(Character.valueOf((char) 0x002b), "mupdate:");
			put(Character.valueOf((char) 0x002c), "news:");
			put(Character.valueOf((char) 0x002d), "nfs:");
			put(Character.valueOf((char) 0x002e), "ni:");
			put(Character.valueOf((char) 0x002f), "nih:");
			put(Character.valueOf((char) 0x0030), "nntp:");
			put(Character.valueOf((char) 0x0031), "opaquelocktoken:");
			put(Character.valueOf((char) 0x0032), "pop:");
			put(Character.valueOf((char) 0x0033), "pres:");
			put(Character.valueOf((char) 0x0034), "reload:");
			put(Character.valueOf((char) 0x0035), "rtsp:");
			put(Character.valueOf((char) 0x0036), "rtsps:");
			put(Character.valueOf((char) 0x0037), "rtspu:");
			put(Character.valueOf((char) 0x0038), "service:");
			put(Character.valueOf((char) 0x0039), "session:");
			put(Character.valueOf((char) 0x003a), "shttp:");
			put(Character.valueOf((char) 0x003b), "sieve:");
			put(Character.valueOf((char) 0x003c), "sip:");
			put(Character.valueOf((char) 0x003d), "sips:");
			put(Character.valueOf((char) 0x003e), "sms:");
			put(Character.valueOf((char) 0x003f), "snmp:");
			put(Character.valueOf((char) 0x0040), "soap.beep:");
			put(Character.valueOf((char) 0x0041), "soap.beeps:");
			put(Character.valueOf((char) 0x0042), "stun:");
			put(Character.valueOf((char) 0x0043), "stuns:");
			put(Character.valueOf((char) 0x0044), "tag:");
			put(Character.valueOf((char) 0x0045), "tel:");
			put(Character.valueOf((char) 0x0046), "telnet:");
			put(Character.valueOf((char) 0x0047), "tftp:");
			put(Character.valueOf((char) 0x0048), "thismessage:");
			put(Character.valueOf((char) 0x0049), "tn3270:");
			put(Character.valueOf((char) 0x004a), "tip:");
			put(Character.valueOf((char) 0x004b), "turn:");
			put(Character.valueOf((char) 0x004c), "turns:");
			put(Character.valueOf((char) 0x004d), "tv:");
			put(Character.valueOf((char) 0x004e), "urn:");
			put(Character.valueOf((char) 0x004f), "vemmi:");
			put(Character.valueOf((char) 0x0050), "ws:");
			put(Character.valueOf((char) 0x0051), "wss:");
			put(Character.valueOf((char) 0x0052), "xcon:");
			put(Character.valueOf((char) 0x0053), "xcon-userid:");
			put(Character.valueOf((char) 0x0054), "xmlrpc.beep:");
			put(Character.valueOf((char) 0x0055), "xmlrpc.beeps:");
			put(Character.valueOf((char) 0x0056), "xmpp:");
			put(Character.valueOf((char) 0x0057), "z39.50r:");
			put(Character.valueOf((char) 0x0058), "z39.50s:");
			put(Character.valueOf((char) 0x0059), "acr:");
			put(Character.valueOf((char) 0x005a), "adiumxtra:");
			put(Character.valueOf((char) 0x005b), "afp:");
			put(Character.valueOf((char) 0x005c), "afs:");
			put(Character.valueOf((char) 0x005d), "aim:");
			put(Character.valueOf((char) 0x005e), "apt:");
			put(Character.valueOf((char) 0x005f), "attachment:");
			put(Character.valueOf((char) 0x0060), "aw:");
			put(Character.valueOf((char) 0x0061), "barion:");
			put(Character.valueOf((char) 0x0062), "beshare:");
			put(Character.valueOf((char) 0x0063), "bitcoin:");
			put(Character.valueOf((char) 0x0064), "bolo:");
			put(Character.valueOf((char) 0x0065), "callto:");
			put(Character.valueOf((char) 0x0066), "chrome:");
			put(Character.valueOf((char) 0x0067), "chrome-extension:");
			put(Character.valueOf((char) 0x0068), "com-eventbrite-attendee:");
			put(Character.valueOf((char) 0x0069), "content:");
			put(Character.valueOf((char) 0x006a), "cvs:");
			put(Character.valueOf((char) 0x006b), "dlna-playsingle:");
			put(Character.valueOf((char) 0x006c), "dlna-playcontainer:");
			put(Character.valueOf((char) 0x006d), "dtn:");
			put(Character.valueOf((char) 0x006e), "dvb:");
			put(Character.valueOf((char) 0x006f), "ed2k:");
			put(Character.valueOf((char) 0x0070), "facetime:");
			put(Character.valueOf((char) 0x0071), "feed:");
			put(Character.valueOf((char) 0x0072), "feedready:");
			put(Character.valueOf((char) 0x0073), "finger:");
			put(Character.valueOf((char) 0x0074), "fish:");
			put(Character.valueOf((char) 0x0075), "gg:");
			put(Character.valueOf((char) 0x0076), "git:");
			put(Character.valueOf((char) 0x0077), "gizmoproject:");
			put(Character.valueOf((char) 0x0078), "gtalk:");
			put(Character.valueOf((char) 0x0079), "ham:");
			put(Character.valueOf((char) 0x007a), "hcp:");
			put(Character.valueOf((char) 0x007b), "icon:");
			put(Character.valueOf((char) 0x007c), "ipn:");
			put(Character.valueOf((char) 0x007d), "irc:");
			put(Character.valueOf((char) 0x007e), "irc6:");
			put(Character.valueOf((char) 0x007f), "ircs:");
			put(Character.valueOf((char) 0x0080), "itms:");
			put(Character.valueOf((char) 0x0081), "jar:");
			put(Character.valueOf((char) 0x0082), "jms:");
			put(Character.valueOf((char) 0x0083), "keyparc:");
			put(Character.valueOf((char) 0x0084), "lastfm:");
			put(Character.valueOf((char) 0x0085), "ldaps:");
			put(Character.valueOf((char) 0x0086), "magnet:");
			put(Character.valueOf((char) 0x0087), "maps:");
			put(Character.valueOf((char) 0x0088), "market:");
			put(Character.valueOf((char) 0x0089), "message:");
			put(Character.valueOf((char) 0x008a), "mms:");
			put(Character.valueOf((char) 0x008b), "ms-help:");
			put(Character.valueOf((char) 0x008c), "ms-settings-power:");
			put(Character.valueOf((char) 0x008d), "msnim:");
			put(Character.valueOf((char) 0x008e), "mumble:");
			put(Character.valueOf((char) 0x008f), "mvn:");
			put(Character.valueOf((char) 0x0090), "notes:");
			put(Character.valueOf((char) 0x0091), "oid:");
			put(Character.valueOf((char) 0x0092), "palm:");
			put(Character.valueOf((char) 0x0093), "paparazzi:");
			put(Character.valueOf((char) 0x0094), "pkcs11:");
			put(Character.valueOf((char) 0x0095), "platform:");
			put(Character.valueOf((char) 0x0096), "proxy:");
			put(Character.valueOf((char) 0x0097), "psyc:");
			put(Character.valueOf((char) 0x0098), "query:");
			put(Character.valueOf((char) 0x0099), "res:");
			put(Character.valueOf((char) 0x009a), "resource:");
			put(Character.valueOf((char) 0x009b), "rmi:");
			put(Character.valueOf((char) 0x009c), "rsync:");
			put(Character.valueOf((char) 0x009d), "rtmfp:");
			put(Character.valueOf((char) 0x009e), "rtmp:");
			put(Character.valueOf((char) 0x009f), "secondlife:");
			put(Character.valueOf((char) 0x00a0), "sftp:");
			put(Character.valueOf((char) 0x00a1), "sgn:");
			put(Character.valueOf((char) 0x00a2), "skype:");
			put(Character.valueOf((char) 0x00a3), "smb:");
			put(Character.valueOf((char) 0x00a4), "smtp:");
			put(Character.valueOf((char) 0x00a5), "soldat:");
			put(Character.valueOf((char) 0x00a6), "spotify:");
			put(Character.valueOf((char) 0x00a7), "ssh:");
			put(Character.valueOf((char) 0x00a8), "steam:");
			put(Character.valueOf((char) 0x00a9), "submit:");
			put(Character.valueOf((char) 0x00aa), "svn:");
			put(Character.valueOf((char) 0x00ab), "teamspeak:");
			put(Character.valueOf((char) 0x00ac), "teliaeid:");
			put(Character.valueOf((char) 0x00ad), "things:");
			put(Character.valueOf((char) 0x00ae), "udp:");
			put(Character.valueOf((char) 0x00af), "unreal:");
			put(Character.valueOf((char) 0x00b0), "ut2004:");
			put(Character.valueOf((char) 0x00b1), "ventrilo:");
			put(Character.valueOf((char) 0x00b2), "view-source:");
			put(Character.valueOf((char) 0x00b3), "webcal:");
			put(Character.valueOf((char) 0x00b4), "wtai:");
			put(Character.valueOf((char) 0x00b5), "wyciwyg:");
			put(Character.valueOf((char) 0x00b6), "xfire:");
			put(Character.valueOf((char) 0x00b7), "xri:");
			put(Character.valueOf((char) 0x00b8), "ymsgr:");
			put(Character.valueOf((char) 0x00b9), "example:");
			put(Character.valueOf((char) 0x00ba), "ms-settings-cloudstorage:");
		}
	}

	/**
	 * URI Scheme Name String Mapping.pdf
	 */
	public static final Map<Character, String> SCHEME_MAPPING = Collections
			.synchronizedMap(Collections.unmodifiableMap(new SchemeMap()));

	/**
	 * aaa: (Scheme Code Point: 0x0002)
	 */
	public static final Character AAA_SCHEME = Character.valueOf((char) 0x0002);

	/**
	 * aaas: (Scheme Code Point: 0x0003)
	 */
	public static final Character AAAS_SCHEME = Character.valueOf((char) 0x0003);

	/**
	 * about: (Scheme Code Point: 0x0004)
	 */
	public static final Character ABOUT_SCHEME = Character.valueOf((char) 0x0004);

	/**
	 * acap: (Scheme Code Point: 0x0005)
	 */
	public static final Character ACAP_SCHEME = Character.valueOf((char) 0x0005);

	/**
	 * acct: (Scheme Code Point: 0x0006)
	 */
	public static final Character ACCT_SCHEME = Character.valueOf((char) 0x0006);

	/**
	 * cap: (Scheme Code Point: 0x0007)
	 */
	public static final Character CAP_SCHEME = Character.valueOf((char) 0x0007);

	/**
	 * cid: (Scheme Code Point: 0x0008)
	 */
	public static final Character CID_SCHEME = Character.valueOf((char) 0x0008);

	/**
	 * coap: (Scheme Code Point: 0x0009)
	 */
	public static final Character COAP_SCHEME = Character.valueOf((char) 0x0009);

	/**
	 * coaps: (Scheme Code Point: 0x000a)
	 */
	public static final Character COAPS_SCHEME = Character.valueOf((char) 0x000a);

	/**
	 * crid: (Scheme Code Point: 0x000b)
	 */
	public static final Character CRID_SCHEME = Character.valueOf((char) 0x000b);

	/**
	 * data: (Scheme Code Point: 0x000c)
	 */
	public static final Character DATA_SCHEME = Character.valueOf((char) 0x000c);

	/**
	 * dav: (Scheme Code Point: 0x000d)
	 */
	public static final Character DAV_SCHEME = Character.valueOf((char) 0x000d);

	/**
	 * dict: (Scheme Code Point: 0x000e)
	 */
	public static final Character DICT_SCHEME = Character.valueOf((char) 0x000e);

	/**
	 * dns: (Scheme Code Point: 0x000f)
	 */
	public static final Character DNS_SCHEME = Character.valueOf((char) 0x000f);

	/**
	 * file: (Scheme Code Point: 0x0010)
	 */
	public static final Character FILE_SCHEME = Character.valueOf((char) 0x0010);

	/**
	 * ftp: (Scheme Code Point: 0x0011)
	 */
	public static final Character FTP_SCHEME = Character.valueOf((char) 0x0011);

	/**
	 * geo: (Scheme Code Point: 0x0012)
	 */
	public static final Character GEO_SCHEME = Character.valueOf((char) 0x0012);

	/**
	 * go: (Scheme Code Point: 0x0013)
	 */
	public static final Character GO_SCHEME = Character.valueOf((char) 0x0013);

	/**
	 * gopher: (Scheme Code Point: 0x0014)
	 */
	public static final Character GOPHER_SCHEME = Character.valueOf((char) 0x0014);

	/**
	 * h323: (Scheme Code Point: 0x0015)
	 */
	public static final Character H323_SCHEME = Character.valueOf((char) 0x0015);

	/**
	 * http: (Scheme Code Point: 0x0016)
	 */
	public static final Character HTTP_SCHEME = Character.valueOf((char) 0x0016);

	/**
	 * https: (Scheme Code Point: 0x0017)
	 */
	public static final Character HTTPS_SCHEME = Character.valueOf((char) 0x0017);

	/**
	 * iax: (Scheme Code Point: 0x0018)
	 */
	public static final Character IAX_SCHEME = Character.valueOf((char) 0x0018);

	/**
	 * icap: (Scheme Code Point: 0x0019)
	 */
	public static final Character ICAP_SCHEME = Character.valueOf((char) 0x0019);

	/**
	 * im: (Scheme Code Point: 0x001a)
	 */
	public static final Character IM_SCHEME = Character.valueOf((char) 0x001a);

	/**
	 * imap: (Scheme Code Point: 0x001b)
	 */
	public static final Character IMAP_SCHEME = Character.valueOf((char) 0x001b);

	/**
	 * info: (Scheme Code Point: 0x001c)
	 */
	public static final Character INFO_SCHEME = Character.valueOf((char) 0x001c);

	/**
	 * ipp: (Scheme Code Point: 0x001d)
	 */
	public static final Character IPP_SCHEME = Character.valueOf((char) 0x001d);

	/**
	 * ipps: (Scheme Code Point: 0x001e)
	 */
	public static final Character IPPS_SCHEME = Character.valueOf((char) 0x001e);

	/**
	 * iris: (Scheme Code Point: 0x001f)
	 */
	public static final Character IRIS_SCHEME = Character.valueOf((char) 0x001f);

	/**
	 * iris.beep: (Scheme Code Point: 0x0020)
	 */
	public static final Character IRIS_BEEP_SCHEME = Character.valueOf((char) 0x0020);

	/**
	 * iris.xpc: (Scheme Code Point: 0x0021)
	 */
	public static final Character IRIS_XPC_SCHEME = Character.valueOf((char) 0x0021);

	/**
	 * iris.xpcs: (Scheme Code Point: 0x0022)
	 */
	public static final Character IRIS_XPCS_SCHEME = Character.valueOf((char) 0x0022);

	/**
	 * iris.lwz: (Scheme Code Point: 0x0023)
	 */
	public static final Character IRIS_LWZ_SCHEME = Character.valueOf((char) 0x0023);

	/**
	 * jabber: (Scheme Code Point: 0x0024)
	 */
	public static final Character JABBER_SCHEME = Character.valueOf((char) 0x0024);

	/**
	 * ldap: (Scheme Code Point: 0x0025)
	 */
	public static final Character LDAP_SCHEME = Character.valueOf((char) 0x0025);

	/**
	 * mailto: (Scheme Code Point: 0x0026)
	 */
	public static final Character MAILTO_SCHEME = Character.valueOf((char) 0x0026);

	/**
	 * mid: (Scheme Code Point: 0x0027)
	 */
	public static final Character MID_SCHEME = Character.valueOf((char) 0x0027);

	/**
	 * msrp: (Scheme Code Point: 0x0028)
	 */
	public static final Character MSRP_SCHEME = Character.valueOf((char) 0x0028);

	/**
	 * msrps: (Scheme Code Point: 0x0029)
	 */
	public static final Character MSRPS_SCHEME = Character.valueOf((char) 0x0029);

	/**
	 * mtqp: (Scheme Code Point: 0x002a)
	 */
	public static final Character MTQP_SCHEME = Character.valueOf((char) 0x002a);

	/**
	 * mupdate: (Scheme Code Point: 0x002b)
	 */
	public static final Character MUPDATE_SCHEME = Character.valueOf((char) 0x002b);

	/**
	 * news: (Scheme Code Point: 0x002c)
	 */
	public static final Character NEWS_SCHEME = Character.valueOf((char) 0x002c);

	/**
	 * nfs: (Scheme Code Point: 0x002d)
	 */
	public static final Character NFS_SCHEME = Character.valueOf((char) 0x002d);

	/**
	 * ni: (Scheme Code Point: 0x002e)
	 */
	public static final Character NI_SCHEME = Character.valueOf((char) 0x002e);

	/**
	 * nih: (Scheme Code Point: 0x002f)
	 */
	public static final Character NIH_SCHEME = Character.valueOf((char) 0x002f);

	/**
	 * nntp: (Scheme Code Point: 0x0030)
	 */
	public static final Character NNTP_SCHEME = Character.valueOf((char) 0x0030);

	/**
	 * opaquelocktoken: (Scheme Code Point: 0x0031)
	 */
	public static final Character OPAQUELOCKTOKEN_SCHEME = Character.valueOf((char) 0x0031);

	/**
	 * pop: (Scheme Code Point: 0x0032)
	 */
	public static final Character POP_SCHEME = Character.valueOf((char) 0x0032);

	/**
	 * pres: (Scheme Code Point: 0x0033)
	 */
	public static final Character PRES_SCHEME = Character.valueOf((char) 0x0033);

	/**
	 * reload: (Scheme Code Point: 0x0034)
	 */
	public static final Character RELOAD_SCHEME = Character.valueOf((char) 0x0034);

	/**
	 * rtsp: (Scheme Code Point: 0x0035)
	 */
	public static final Character RTSP_SCHEME = Character.valueOf((char) 0x0035);

	/**
	 * rtsps: (Scheme Code Point: 0x0036)
	 */
	public static final Character RTSPS_SCHEME = Character.valueOf((char) 0x0036);

	/**
	 * rtspu: (Scheme Code Point: 0x0037)
	 */
	public static final Character RTSPU_SCHEME = Character.valueOf((char) 0x0037);

	/**
	 * service: (Scheme Code Point: 0x0038)
	 */
	public static final Character SERVICE_SCHEME = Character.valueOf((char) 0x0038);

	/**
	 * session: (Scheme Code Point: 0x0039)
	 */
	public static final Character SESSION_SCHEME = Character.valueOf((char) 0x0039);

	/**
	 * shttp: (Scheme Code Point: 0x003a)
	 */
	public static final Character SHTTP_SCHEME = Character.valueOf((char) 0x003a);

	/**
	 * sieve: (Scheme Code Point: 0x003b)
	 */
	public static final Character SIEVE_SCHEME = Character.valueOf((char) 0x003b);

	/**
	 * sip: (Scheme Code Point: 0x003c)
	 */
	public static final Character SIP_SCHEME = Character.valueOf((char) 0x003c);

	/**
	 * sips: (Scheme Code Point: 0x003d)
	 */
	public static final Character SIPS_SCHEME = Character.valueOf((char) 0x003d);

	/**
	 * sms: (Scheme Code Point: 0x003e)
	 */
	public static final Character SMS_SCHEME = Character.valueOf((char) 0x003e);

	/**
	 * snmp: (Scheme Code Point: 0x003f)
	 */
	public static final Character SNMP_SCHEME = Character.valueOf((char) 0x003f);

	/**
	 * soap.beep: (Scheme Code Point: 0x0040)
	 */
	public static final Character SOAP_BEEP_SCHEME = Character.valueOf((char) 0x0040);

	/**
	 * soap.beeps: (Scheme Code Point: 0x0041)
	 */
	public static final Character SOAP_BEEPS_SCHEME = Character.valueOf((char) 0x0041);

	/**
	 * stun: (Scheme Code Point: 0x0042)
	 */
	public static final Character STUN_SCHEME = Character.valueOf((char) 0x0042);

	/**
	 * stuns: (Scheme Code Point: 0x0043)
	 */
	public static final Character STUNS_SCHEME = Character.valueOf((char) 0x0043);

	/**
	 * tag: (Scheme Code Point: 0x0044)
	 */
	public static final Character TAG_SCHEME = Character.valueOf((char) 0x0044);

	/**
	 * tel: (Scheme Code Point: 0x0045)
	 */
	public static final Character TEL_SCHEME = Character.valueOf((char) 0x0045);

	/**
	 * telnet: (Scheme Code Point: 0x0046)
	 */
	public static final Character TELNET_SCHEME = Character.valueOf((char) 0x0046);

	/**
	 * tftp: (Scheme Code Point: 0x0047)
	 */
	public static final Character TFTP_SCHEME = Character.valueOf((char) 0x0047);

	/**
	 * thismessage: (Scheme Code Point: 0x0048)
	 */
	public static final Character THISMESSAGE_SCHEME = Character.valueOf((char) 0x0048);

	/**
	 * tn3270: (Scheme Code Point: 0x0049)
	 */
	public static final Character TN3270_SCHEME = Character.valueOf((char) 0x0049);

	/**
	 * tip: (Scheme Code Point: 0x004a)
	 */
	public static final Character TIP_SCHEME = Character.valueOf((char) 0x004a);

	/**
	 * turn: (Scheme Code Point: 0x004b)
	 */
	public static final Character TURN_SCHEME = Character.valueOf((char) 0x004b);

	/**
	 * turns: (Scheme Code Point: 0x004c)
	 */
	public static final Character TURNS_SCHEME = Character.valueOf((char) 0x004c);

	/**
	 * tv: (Scheme Code Point: 0x004d)
	 */
	public static final Character TV_SCHEME = Character.valueOf((char) 0x004d);

	/**
	 * urn: (Scheme Code Point: 0x004e)
	 */
	public static final Character URN_SCHEME = Character.valueOf((char) 0x004e);

	/**
	 * vemmi: (Scheme Code Point: 0x004f)
	 */
	public static final Character VEMMI_SCHEME = Character.valueOf((char) 0x004f);

	/**
	 * ws: (Scheme Code Point: 0x0050)
	 */
	public static final Character WS_SCHEME = Character.valueOf((char) 0x0050);

	/**
	 * wss: (Scheme Code Point: 0x0051)
	 */
	public static final Character WSS_SCHEME = Character.valueOf((char) 0x0051);

	/**
	 * xcon: (Scheme Code Point: 0x0052)
	 */
	public static final Character XCON_SCHEME = Character.valueOf((char) 0x0052);

	/**
	 * xcon-userid: (Scheme Code Point: 0x0053)
	 */
	public static final Character XCON_USERID_SCHEME = Character.valueOf((char) 0x0053);

	/**
	 * xmlrpc.beep: (Scheme Code Point: 0x0054)
	 */
	public static final Character XMLRPC_BEEP_SCHEME = Character.valueOf((char) 0x0054);

	/**
	 * xmlrpc.beeps: (Scheme Code Point: 0x0055)
	 */
	public static final Character XMLRPC_BEEPS_SCHEME = Character.valueOf((char) 0x0055);

	/**
	 * xmpp: (Scheme Code Point: 0x0056)
	 */
	public static final Character XMPP_SCHEME = Character.valueOf((char) 0x0056);

	/**
	 * z39.50r: (Scheme Code Point: 0x0057)
	 */
	public static final Character Z39_50R_SCHEME = Character.valueOf((char) 0x0057);

	/**
	 * z39.50s: (Scheme Code Point: 0x0058)
	 */
	public static final Character Z39_50S_SCHEME = Character.valueOf((char) 0x0058);

	/**
	 * acr: (Scheme Code Point: 0x0059)
	 */
	public static final Character ACR_SCHEME = Character.valueOf((char) 0x0059);

	/**
	 * adiumxtra: (Scheme Code Point: 0x005a)
	 */
	public static final Character ADIUMXTRA_SCHEME = Character.valueOf((char) 0x005a);

	/**
	 * afp: (Scheme Code Point: 0x005b)
	 */
	public static final Character AFP_SCHEME = Character.valueOf((char) 0x005b);

	/**
	 * afs: (Scheme Code Point: 0x005c)
	 */
	public static final Character AFS_SCHEME = Character.valueOf((char) 0x005c);

	/**
	 * aim: (Scheme Code Point: 0x005d)
	 */
	public static final Character AIM_SCHEME = Character.valueOf((char) 0x005d);

	/**
	 * apt: (Scheme Code Point: 0x005e)
	 */
	public static final Character APT_SCHEME = Character.valueOf((char) 0x005e);

	/**
	 * attachment: (Scheme Code Point: 0x005f)
	 */
	public static final Character ATTACHMENT_SCHEME = Character.valueOf((char) 0x005f);

	/**
	 * aw: (Scheme Code Point: 0x0060)
	 */
	public static final Character AW_SCHEME = Character.valueOf((char) 0x0060);

	/**
	 * barion: (Scheme Code Point: 0x0061)
	 */
	public static final Character BARION_SCHEME = Character.valueOf((char) 0x0061);

	/**
	 * beshare: (Scheme Code Point: 0x0062)
	 */
	public static final Character BESHARE_SCHEME = Character.valueOf((char) 0x0062);

	/**
	 * bitcoin: (Scheme Code Point: 0x0063)
	 */
	public static final Character BITCOIN_SCHEME = Character.valueOf((char) 0x0063);

	/**
	 * bolo: (Scheme Code Point: 0x0064)
	 */
	public static final Character BOLO_SCHEME = Character.valueOf((char) 0x0064);

	/**
	 * callto: (Scheme Code Point: 0x0065)
	 */
	public static final Character CALLTO_SCHEME = Character.valueOf((char) 0x0065);

	/**
	 * chrome: (Scheme Code Point: 0x0066)
	 */
	public static final Character CHROME_SCHEME = Character.valueOf((char) 0x0066);

	/**
	 * chrome-extension: (Scheme Code Point: 0x0067)
	 */
	public static final Character CHROME_EXTENSION_SCHEME = Character.valueOf((char) 0x0067);

	/**
	 * com-eventbrite-attendee: (Scheme Code Point: 0x0068)
	 */
	public static final Character COM_EVENTBRITE_ATTENDEE_SCHEME = Character.valueOf((char) 0x0068);

	/**
	 * content: (Scheme Code Point: 0x0069)
	 */
	public static final Character CONTENT_SCHEME = Character.valueOf((char) 0x0069);

	/**
	 * cvs: (Scheme Code Point: 0x006a)
	 */
	public static final Character CVS_SCHEME = Character.valueOf((char) 0x006a);

	/**
	 * dlna-playsingle: (Scheme Code Point: 0x006b)
	 */
	public static final Character DLNA_PLAYSINGLE_SCHEME = Character.valueOf((char) 0x006b);

	/**
	 * dlna-playcontainer: (Scheme Code Point: 0x006c)
	 */
	public static final Character DLNA_PLAYCONTAINER_SCHEME = Character.valueOf((char) 0x006c);

	/**
	 * dtn: (Scheme Code Point: 0x006d)
	 */
	public static final Character DTN_SCHEME = Character.valueOf((char) 0x006d);

	/**
	 * dvb: (Scheme Code Point: 0x006e)
	 */
	public static final Character DVB_SCHEME = Character.valueOf((char) 0x006e);

	/**
	 * ed2k: (Scheme Code Point: 0x006f)
	 */
	public static final Character ED2K_SCHEME = Character.valueOf((char) 0x006f);

	/**
	 * facetime: (Scheme Code Point: 0x0070)
	 */
	public static final Character FACETIME_SCHEME = Character.valueOf((char) 0x0070);

	/**
	 * feed: (Scheme Code Point: 0x0071)
	 */
	public static final Character FEED_SCHEME = Character.valueOf((char) 0x0071);

	/**
	 * feedready: (Scheme Code Point: 0x0072)
	 */
	public static final Character FEEDREADY_SCHEME = Character.valueOf((char) 0x0072);

	/**
	 * finger: (Scheme Code Point: 0x0073)
	 */
	public static final Character FINGER_SCHEME = Character.valueOf((char) 0x0073);

	/**
	 * fish: (Scheme Code Point: 0x0074)
	 */
	public static final Character FISH_SCHEME = Character.valueOf((char) 0x0074);

	/**
	 * gg: (Scheme Code Point: 0x0075)
	 */
	public static final Character GG_SCHEME = Character.valueOf((char) 0x0075);

	/**
	 * git: (Scheme Code Point: 0x0076)
	 */
	public static final Character GIT_SCHEME = Character.valueOf((char) 0x0076);

	/**
	 * gizmoproject: (Scheme Code Point: 0x0077)
	 */
	public static final Character GIZMOPROJECT_SCHEME = Character.valueOf((char) 0x0077);

	/**
	 * gtalk: (Scheme Code Point: 0x0078)
	 */
	public static final Character GTALK_SCHEME = Character.valueOf((char) 0x0078);

	/**
	 * ham: (Scheme Code Point: 0x0079)
	 */
	public static final Character HAM_SCHEME = Character.valueOf((char) 0x0079);

	/**
	 * hcp: (Scheme Code Point: 0x007a)
	 */
	public static final Character HCP_SCHEME = Character.valueOf((char) 0x007a);

	/**
	 * icon: (Scheme Code Point: 0x007b)
	 */
	public static final Character ICON_SCHEME = Character.valueOf((char) 0x007b);

	/**
	 * ipn: (Scheme Code Point: 0x007c)
	 */
	public static final Character IPN_SCHEME = Character.valueOf((char) 0x007c);

	/**
	 * irc: (Scheme Code Point: 0x007d)
	 */
	public static final Character IRC_SCHEME = Character.valueOf((char) 0x007d);

	/**
	 * irc6: (Scheme Code Point: 0x007e)
	 */
	public static final Character IRC6_SCHEME = Character.valueOf((char) 0x007e);

	/**
	 * ircs: (Scheme Code Point: 0x007f)
	 */
	public static final Character IRCS_SCHEME = Character.valueOf((char) 0x007f);

	/**
	 * itms: (Scheme Code Point: 0x0080)
	 */
	public static final Character ITMS_SCHEME = Character.valueOf((char) 0x0080);

	/**
	 * jar: (Scheme Code Point: 0x0081)
	 */
	public static final Character JAR_SCHEME = Character.valueOf((char) 0x0081);

	/**
	 * jms: (Scheme Code Point: 0x0082)
	 */
	public static final Character JMS_SCHEME = Character.valueOf((char) 0x0082);

	/**
	 * keyparc: (Scheme Code Point: 0x0083)
	 */
	public static final Character KEYPARC_SCHEME = Character.valueOf((char) 0x0083);

	/**
	 * lastfm: (Scheme Code Point: 0x0084)
	 */
	public static final Character LASTFM_SCHEME = Character.valueOf((char) 0x0084);

	/**
	 * ldaps: (Scheme Code Point: 0x0085)
	 */
	public static final Character LDAPS_SCHEME = Character.valueOf((char) 0x0085);

	/**
	 * magnet: (Scheme Code Point: 0x0086)
	 */
	public static final Character MAGNET_SCHEME = Character.valueOf((char) 0x0086);

	/**
	 * maps: (Scheme Code Point: 0x0087)
	 */
	public static final Character MAPS_SCHEME = Character.valueOf((char) 0x0087);

	/**
	 * market: (Scheme Code Point: 0x0088)
	 */
	public static final Character MARKET_SCHEME = Character.valueOf((char) 0x0088);

	/**
	 * message: (Scheme Code Point: 0x0089)
	 */
	public static final Character MESSAGE_SCHEME = Character.valueOf((char) 0x0089);

	/**
	 * mms: (Scheme Code Point: 0x008a)
	 */
	public static final Character MMS_SCHEME = Character.valueOf((char) 0x008a);

	/**
	 * ms-help: (Scheme Code Point: 0x008b)
	 */
	public static final Character MS_HELP_SCHEME = Character.valueOf((char) 0x008b);

	/**
	 * ms-settings-power: (Scheme Code Point: 0x008c)
	 */
	public static final Character MS_SETTINGS_POWER_SCHEME = Character.valueOf((char) 0x008c);

	/**
	 * msnim: (Scheme Code Point: 0x008d)
	 */
	public static final Character MSNIM_SCHEME = Character.valueOf((char) 0x008d);

	/**
	 * mumble: (Scheme Code Point: 0x008e)
	 */
	public static final Character MUMBLE_SCHEME = Character.valueOf((char) 0x008e);

	/**
	 * mvn: (Scheme Code Point: 0x008f)
	 */
	public static final Character MVN_SCHEME = Character.valueOf((char) 0x008f);

	/**
	 * notes: (Scheme Code Point: 0x0090)
	 */
	public static final Character NOTES_SCHEME = Character.valueOf((char) 0x0090);

	/**
	 * oid: (Scheme Code Point: 0x0091)
	 */
	public static final Character OID_SCHEME = Character.valueOf((char) 0x0091);

	/**
	 * palm: (Scheme Code Point: 0x0092)
	 */
	public static final Character PALM_SCHEME = Character.valueOf((char) 0x0092);

	/**
	 * paparazzi: (Scheme Code Point: 0x0093)
	 */
	public static final Character PAPARAZZI_SCHEME = Character.valueOf((char) 0x0093);

	/**
	 * pkcs11: (Scheme Code Point: 0x0094)
	 */
	public static final Character PKCS11_SCHEME = Character.valueOf((char) 0x0094);

	/**
	 * platform: (Scheme Code Point: 0x0095)
	 */
	public static final Character PLATFORM_SCHEME = Character.valueOf((char) 0x0095);

	/**
	 * proxy: (Scheme Code Point: 0x0096)
	 */
	public static final Character PROXY_SCHEME = Character.valueOf((char) 0x0096);

	/**
	 * psyc: (Scheme Code Point: 0x0097)
	 */
	public static final Character PSYC_SCHEME = Character.valueOf((char) 0x0097);

	/**
	 * query: (Scheme Code Point: 0x0098)
	 */
	public static final Character QUERY_SCHEME = Character.valueOf((char) 0x0098);

	/**
	 * res: (Scheme Code Point: 0x0099)
	 */
	public static final Character RES_SCHEME = Character.valueOf((char) 0x0099);

	/**
	 * resource: (Scheme Code Point: 0x009a)
	 */
	public static final Character RESOURCE_SCHEME = Character.valueOf((char) 0x009a);

	/**
	 * rmi: (Scheme Code Point: 0x009b)
	 */
	public static final Character RMI_SCHEME = Character.valueOf((char) 0x009b);

	/**
	 * rsync: (Scheme Code Point: 0x009c)
	 */
	public static final Character RSYNC_SCHEME = Character.valueOf((char) 0x009c);

	/**
	 * rtmfp: (Scheme Code Point: 0x009d)
	 */
	public static final Character RTMFP_SCHEME = Character.valueOf((char) 0x009d);

	/**
	 * rtmp: (Scheme Code Point: 0x009e)
	 */
	public static final Character RTMP_SCHEME = Character.valueOf((char) 0x009e);

	/**
	 * secondlife: (Scheme Code Point: 0x009f)
	 */
	public static final Character SECONDLIFE_SCHEME = Character.valueOf((char) 0x009f);

	/**
	 * sftp: (Scheme Code Point: 0x00a0)
	 */
	public static final Character SFTP_SCHEME = Character.valueOf((char) 0x00a0);

	/**
	 * sgn: (Scheme Code Point: 0x00a1)
	 */
	public static final Character SGN_SCHEME = Character.valueOf((char) 0x00a1);

	/**
	 * skype: (Scheme Code Point: 0x00a2)
	 */
	public static final Character SKYPE_SCHEME = Character.valueOf((char) 0x00a2);

	/**
	 * smb: (Scheme Code Point: 0x00a3)
	 */
	public static final Character SMB_SCHEME = Character.valueOf((char) 0x00a3);

	/**
	 * smtp: (Scheme Code Point: 0x00a4)
	 */
	public static final Character SMTP_SCHEME = Character.valueOf((char) 0x00a4);

	/**
	 * soldat: (Scheme Code Point: 0x00a5)
	 */
	public static final Character SOLDAT_SCHEME = Character.valueOf((char) 0x00a5);

	/**
	 * spotify: (Scheme Code Point: 0x00a6)
	 */
	public static final Character SPOTIFY_SCHEME = Character.valueOf((char) 0x00a6);

	/**
	 * ssh: (Scheme Code Point: 0x00a7)
	 */
	public static final Character SSH_SCHEME = Character.valueOf((char) 0x00a7);

	/**
	 * steam: (Scheme Code Point: 0x00a8)
	 */
	public static final Character STEAM_SCHEME = Character.valueOf((char) 0x00a8);

	/**
	 * submit: (Scheme Code Point: 0x00a9)
	 */
	public static final Character SUBMIT_SCHEME = Character.valueOf((char) 0x00a9);

	/**
	 * svn: (Scheme Code Point: 0x00aa)
	 */
	public static final Character SVN_SCHEME = Character.valueOf((char) 0x00aa);

	/**
	 * teamspeak: (Scheme Code Point: 0x00ab)
	 */
	public static final Character TEAMSPEAK_SCHEME = Character.valueOf((char) 0x00ab);

	/**
	 * teliaeid: (Scheme Code Point: 0x00ac)
	 */
	public static final Character TELIAEID_SCHEME = Character.valueOf((char) 0x00ac);

	/**
	 * things: (Scheme Code Point: 0x00ad)
	 */
	public static final Character THINGS_SCHEME = Character.valueOf((char) 0x00ad);

	/**
	 * udp: (Scheme Code Point: 0x00ae)
	 */
	public static final Character UDP_SCHEME = Character.valueOf((char) 0x00ae);

	/**
	 * unreal: (Scheme Code Point: 0x00af)
	 */
	public static final Character UNREAL_SCHEME = Character.valueOf((char) 0x00af);

	/**
	 * ut2004: (Scheme Code Point: 0x00b0)
	 */
	public static final Character UT2004_SCHEME = Character.valueOf((char) 0x00b0);

	/**
	 * ventrilo: (Scheme Code Point: 0x00b1)
	 */
	public static final Character VENTRILO_SCHEME = Character.valueOf((char) 0x00b1);

	/**
	 * view-source: (Scheme Code Point: 0x00b2)
	 */
	public static final Character VIEW_SOURCE_SCHEME = Character.valueOf((char) 0x00b2);

	/**
	 * webcal: (Scheme Code Point: 0x00b3)
	 */
	public static final Character WEBCAL_SCHEME = Character.valueOf((char) 0x00b3);

	/**
	 * wtai: (Scheme Code Point: 0x00b4)
	 */
	public static final Character WTAI_SCHEME = Character.valueOf((char) 0x00b4);

	/**
	 * wyciwyg: (Scheme Code Point: 0x00b5)
	 */
	public static final Character WYCIWYG_SCHEME = Character.valueOf((char) 0x00b5);

	/**
	 * xfire: (Scheme Code Point: 0x00b6)
	 */
	public static final Character XFIRE_SCHEME = Character.valueOf((char) 0x00b6);

	/**
	 * xri: (Scheme Code Point: 0x00b7)
	 */
	public static final Character XRI_SCHEME = Character.valueOf((char) 0x00b7);

	/**
	 * ymsgr: (Scheme Code Point: 0x00b8)
	 */
	public static final Character YMSGR_SCHEME = Character.valueOf((char) 0x00b8);

	/**
	 * example: (Scheme Code Point: 0x00b9)
	 */
	public static final Character EXAMPLE_SCHEME = Character.valueOf((char) 0x00b9);

	/**
	 * ms-settings-cloudstorage: (Scheme Code Point: 0x00ba)
	 */
	public static final Character MS_SETTINGS_CLOUDSTORAGE_SCHEME = Character.valueOf((char) 0x00ba);

}