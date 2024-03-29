package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.Scheme.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class SchemeTest extends TestBase {

	@Test
	public void test_map_00001() {
		assertTrue(SCHEME_MAPPING.containsKey(AAA_SCHEME));
		assertEquals(SCHEME_MAPPING.get(AAA_SCHEME), "aaa:");
		assertTrue(SCHEME_MAPPING.containsKey(AAAS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(AAAS_SCHEME), "aaas:");
		assertTrue(SCHEME_MAPPING.containsKey(ABOUT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ABOUT_SCHEME), "about:");
		assertTrue(SCHEME_MAPPING.containsKey(ACAP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ACAP_SCHEME), "acap:");
		assertTrue(SCHEME_MAPPING.containsKey(ACCT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ACCT_SCHEME), "acct:");
		assertTrue(SCHEME_MAPPING.containsKey(CAP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CAP_SCHEME), "cap:");
		assertTrue(SCHEME_MAPPING.containsKey(CID_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CID_SCHEME), "cid:");
		assertTrue(SCHEME_MAPPING.containsKey(COAP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(COAP_SCHEME), "coap:");
		assertTrue(SCHEME_MAPPING.containsKey(COAPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(COAPS_SCHEME), "coaps:");
		assertTrue(SCHEME_MAPPING.containsKey(CRID_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CRID_SCHEME), "crid:");
		assertTrue(SCHEME_MAPPING.containsKey(DATA_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DATA_SCHEME), "data:");
		assertTrue(SCHEME_MAPPING.containsKey(DAV_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DAV_SCHEME), "dav:");
		assertTrue(SCHEME_MAPPING.containsKey(DICT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DICT_SCHEME), "dict:");
		assertTrue(SCHEME_MAPPING.containsKey(DNS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DNS_SCHEME), "dns:");
		assertTrue(SCHEME_MAPPING.containsKey(FILE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FILE_SCHEME), "file:");
		assertTrue(SCHEME_MAPPING.containsKey(FTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FTP_SCHEME), "ftp:");
		assertTrue(SCHEME_MAPPING.containsKey(GEO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GEO_SCHEME), "geo:");
		assertTrue(SCHEME_MAPPING.containsKey(GO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GO_SCHEME), "go:");
		assertTrue(SCHEME_MAPPING.containsKey(GOPHER_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GOPHER_SCHEME), "gopher:");
		assertTrue(SCHEME_MAPPING.containsKey(H323_SCHEME));
		assertEquals(SCHEME_MAPPING.get(H323_SCHEME), "h323:");
		assertTrue(SCHEME_MAPPING.containsKey(HTTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(HTTP_SCHEME), "http:");
		assertTrue(SCHEME_MAPPING.containsKey(HTTPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(HTTPS_SCHEME), "https:");
		assertTrue(SCHEME_MAPPING.containsKey(IAX_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IAX_SCHEME), "iax:");
		assertTrue(SCHEME_MAPPING.containsKey(ICAP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ICAP_SCHEME), "icap:");
		assertTrue(SCHEME_MAPPING.containsKey(IM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IM_SCHEME), "im:");
		assertTrue(SCHEME_MAPPING.containsKey(IMAP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IMAP_SCHEME), "imap:");
		assertTrue(SCHEME_MAPPING.containsKey(INFO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(INFO_SCHEME), "info:");
		assertTrue(SCHEME_MAPPING.containsKey(IPP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IPP_SCHEME), "ipp:");
		assertTrue(SCHEME_MAPPING.containsKey(IPPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IPPS_SCHEME), "ipps:");
		assertTrue(SCHEME_MAPPING.containsKey(IRIS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRIS_SCHEME), "iris:");
		assertTrue(SCHEME_MAPPING.containsKey(IRIS_BEEP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRIS_BEEP_SCHEME), "iris.beep:");
		assertTrue(SCHEME_MAPPING.containsKey(IRIS_XPC_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRIS_XPC_SCHEME), "iris.xpc:");
		assertTrue(SCHEME_MAPPING.containsKey(IRIS_XPCS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRIS_XPCS_SCHEME), "iris.xpcs:");
		assertTrue(SCHEME_MAPPING.containsKey(IRIS_LWZ_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRIS_LWZ_SCHEME), "iris.lwz:");
		assertTrue(SCHEME_MAPPING.containsKey(JABBER_SCHEME));
		assertEquals(SCHEME_MAPPING.get(JABBER_SCHEME), "jabber:");
		assertTrue(SCHEME_MAPPING.containsKey(LDAP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(LDAP_SCHEME), "ldap:");
		assertTrue(SCHEME_MAPPING.containsKey(MAILTO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MAILTO_SCHEME), "mailto:");
		assertTrue(SCHEME_MAPPING.containsKey(MID_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MID_SCHEME), "mid:");
		assertTrue(SCHEME_MAPPING.containsKey(MSRP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MSRP_SCHEME), "msrp:");
		assertTrue(SCHEME_MAPPING.containsKey(MSRPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MSRPS_SCHEME), "msrps:");
		assertTrue(SCHEME_MAPPING.containsKey(MTQP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MTQP_SCHEME), "mtqp:");
		assertTrue(SCHEME_MAPPING.containsKey(MUPDATE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MUPDATE_SCHEME), "mupdate:");
		assertTrue(SCHEME_MAPPING.containsKey(NEWS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(NEWS_SCHEME), "news:");
		assertTrue(SCHEME_MAPPING.containsKey(NFS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(NFS_SCHEME), "nfs:");
		assertTrue(SCHEME_MAPPING.containsKey(NI_SCHEME));
		assertEquals(SCHEME_MAPPING.get(NI_SCHEME), "ni:");
		assertTrue(SCHEME_MAPPING.containsKey(NIH_SCHEME));
		assertEquals(SCHEME_MAPPING.get(NIH_SCHEME), "nih:");
		assertTrue(SCHEME_MAPPING.containsKey(NNTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(NNTP_SCHEME), "nntp:");
		assertTrue(SCHEME_MAPPING.containsKey(OPAQUELOCKTOKEN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(OPAQUELOCKTOKEN_SCHEME), "opaquelocktoken:");
		assertTrue(SCHEME_MAPPING.containsKey(POP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(POP_SCHEME), "pop:");
		assertTrue(SCHEME_MAPPING.containsKey(PRES_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PRES_SCHEME), "pres:");
		assertTrue(SCHEME_MAPPING.containsKey(RELOAD_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RELOAD_SCHEME), "reload:");
		assertTrue(SCHEME_MAPPING.containsKey(RTSP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RTSP_SCHEME), "rtsp:");
		assertTrue(SCHEME_MAPPING.containsKey(RTSPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RTSPS_SCHEME), "rtsps:");
		assertTrue(SCHEME_MAPPING.containsKey(RTSPU_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RTSPU_SCHEME), "rtspu:");
		assertTrue(SCHEME_MAPPING.containsKey(SERVICE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SERVICE_SCHEME), "service:");
		assertTrue(SCHEME_MAPPING.containsKey(SESSION_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SESSION_SCHEME), "session:");
		assertTrue(SCHEME_MAPPING.containsKey(SHTTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SHTTP_SCHEME), "shttp:");
		assertTrue(SCHEME_MAPPING.containsKey(SIEVE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SIEVE_SCHEME), "sieve:");
		assertTrue(SCHEME_MAPPING.containsKey(SIP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SIP_SCHEME), "sip:");
		assertTrue(SCHEME_MAPPING.containsKey(SIPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SIPS_SCHEME), "sips:");
		assertTrue(SCHEME_MAPPING.containsKey(SMS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SMS_SCHEME), "sms:");
		assertTrue(SCHEME_MAPPING.containsKey(SNMP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SNMP_SCHEME), "snmp:");
		assertTrue(SCHEME_MAPPING.containsKey(SOAP_BEEP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SOAP_BEEP_SCHEME), "soap.beep:");
		assertTrue(SCHEME_MAPPING.containsKey(SOAP_BEEPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SOAP_BEEPS_SCHEME), "soap.beeps:");
		assertTrue(SCHEME_MAPPING.containsKey(STUN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(STUN_SCHEME), "stun:");
		assertTrue(SCHEME_MAPPING.containsKey(STUNS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(STUNS_SCHEME), "stuns:");
		assertTrue(SCHEME_MAPPING.containsKey(TAG_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TAG_SCHEME), "tag:");
		assertTrue(SCHEME_MAPPING.containsKey(TEL_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TEL_SCHEME), "tel:");
		assertTrue(SCHEME_MAPPING.containsKey(TELNET_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TELNET_SCHEME), "telnet:");
		assertTrue(SCHEME_MAPPING.containsKey(TFTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TFTP_SCHEME), "tftp:");
		assertTrue(SCHEME_MAPPING.containsKey(THISMESSAGE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(THISMESSAGE_SCHEME), "thismessage:");
		assertTrue(SCHEME_MAPPING.containsKey(TN3270_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TN3270_SCHEME), "tn3270:");
		assertTrue(SCHEME_MAPPING.containsKey(TIP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TIP_SCHEME), "tip:");
		assertTrue(SCHEME_MAPPING.containsKey(TURN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TURN_SCHEME), "turn:");
		assertTrue(SCHEME_MAPPING.containsKey(TURNS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TURNS_SCHEME), "turns:");
		assertTrue(SCHEME_MAPPING.containsKey(TV_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TV_SCHEME), "tv:");
		assertTrue(SCHEME_MAPPING.containsKey(URN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(URN_SCHEME), "urn:");
		assertTrue(SCHEME_MAPPING.containsKey(VEMMI_SCHEME));
		assertEquals(SCHEME_MAPPING.get(VEMMI_SCHEME), "vemmi:");
		assertTrue(SCHEME_MAPPING.containsKey(WS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(WS_SCHEME), "ws:");
		assertTrue(SCHEME_MAPPING.containsKey(WSS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(WSS_SCHEME), "wss:");
		assertTrue(SCHEME_MAPPING.containsKey(XCON_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XCON_SCHEME), "xcon:");
		assertTrue(SCHEME_MAPPING.containsKey(XCON_USERID_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XCON_USERID_SCHEME), "xcon-userid:");
		assertTrue(SCHEME_MAPPING.containsKey(XMLRPC_BEEP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XMLRPC_BEEP_SCHEME), "xmlrpc.beep:");
		assertTrue(SCHEME_MAPPING.containsKey(XMLRPC_BEEPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XMLRPC_BEEPS_SCHEME), "xmlrpc.beeps:");
		assertTrue(SCHEME_MAPPING.containsKey(XMPP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XMPP_SCHEME), "xmpp:");
		assertTrue(SCHEME_MAPPING.containsKey(Z39_50R_SCHEME));
		assertEquals(SCHEME_MAPPING.get(Z39_50R_SCHEME), "z39.50r:");
		assertTrue(SCHEME_MAPPING.containsKey(Z39_50S_SCHEME));
		assertEquals(SCHEME_MAPPING.get(Z39_50S_SCHEME), "z39.50s:");
		assertTrue(SCHEME_MAPPING.containsKey(ACR_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ACR_SCHEME), "acr:");
		assertTrue(SCHEME_MAPPING.containsKey(ADIUMXTRA_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ADIUMXTRA_SCHEME), "adiumxtra:");
		assertTrue(SCHEME_MAPPING.containsKey(AFP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(AFP_SCHEME), "afp:");
		assertTrue(SCHEME_MAPPING.containsKey(AFS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(AFS_SCHEME), "afs:");
		assertTrue(SCHEME_MAPPING.containsKey(AIM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(AIM_SCHEME), "aim:");
		assertTrue(SCHEME_MAPPING.containsKey(APT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(APT_SCHEME), "apt:");
		assertTrue(SCHEME_MAPPING.containsKey(ATTACHMENT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ATTACHMENT_SCHEME), "attachment:");
		assertTrue(SCHEME_MAPPING.containsKey(AW_SCHEME));
		assertEquals(SCHEME_MAPPING.get(AW_SCHEME), "aw:");
		assertTrue(SCHEME_MAPPING.containsKey(BARION_SCHEME));
		assertEquals(SCHEME_MAPPING.get(BARION_SCHEME), "barion:");
		assertTrue(SCHEME_MAPPING.containsKey(BESHARE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(BESHARE_SCHEME), "beshare:");
		assertTrue(SCHEME_MAPPING.containsKey(BITCOIN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(BITCOIN_SCHEME), "bitcoin:");
		assertTrue(SCHEME_MAPPING.containsKey(BOLO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(BOLO_SCHEME), "bolo:");
		assertTrue(SCHEME_MAPPING.containsKey(CALLTO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CALLTO_SCHEME), "callto:");
		assertTrue(SCHEME_MAPPING.containsKey(CHROME_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CHROME_SCHEME), "chrome:");
		assertTrue(SCHEME_MAPPING.containsKey(CHROME_EXTENSION_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CHROME_EXTENSION_SCHEME), "chrome-extension:");
		assertTrue(SCHEME_MAPPING.containsKey(COM_EVENTBRITE_ATTENDEE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(COM_EVENTBRITE_ATTENDEE_SCHEME), "com-eventbrite-attendee:");
		assertTrue(SCHEME_MAPPING.containsKey(CONTENT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CONTENT_SCHEME), "content:");
		assertTrue(SCHEME_MAPPING.containsKey(CVS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(CVS_SCHEME), "cvs:");
		assertTrue(SCHEME_MAPPING.containsKey(DLNA_PLAYSINGLE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DLNA_PLAYSINGLE_SCHEME), "dlna-playsingle:");
		assertTrue(SCHEME_MAPPING.containsKey(DLNA_PLAYCONTAINER_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DLNA_PLAYCONTAINER_SCHEME), "dlna-playcontainer:");
		assertTrue(SCHEME_MAPPING.containsKey(DTN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DTN_SCHEME), "dtn:");
		assertTrue(SCHEME_MAPPING.containsKey(DVB_SCHEME));
		assertEquals(SCHEME_MAPPING.get(DVB_SCHEME), "dvb:");
		assertTrue(SCHEME_MAPPING.containsKey(ED2K_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ED2K_SCHEME), "ed2k:");
		assertTrue(SCHEME_MAPPING.containsKey(FACETIME_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FACETIME_SCHEME), "facetime:");
		assertTrue(SCHEME_MAPPING.containsKey(FEED_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FEED_SCHEME), "feed:");
		assertTrue(SCHEME_MAPPING.containsKey(FEEDREADY_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FEEDREADY_SCHEME), "feedready:");
		assertTrue(SCHEME_MAPPING.containsKey(FINGER_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FINGER_SCHEME), "finger:");
		assertTrue(SCHEME_MAPPING.containsKey(FISH_SCHEME));
		assertEquals(SCHEME_MAPPING.get(FISH_SCHEME), "fish:");
		assertTrue(SCHEME_MAPPING.containsKey(GG_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GG_SCHEME), "gg:");
		assertTrue(SCHEME_MAPPING.containsKey(GIT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GIT_SCHEME), "git:");
		assertTrue(SCHEME_MAPPING.containsKey(GIZMOPROJECT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GIZMOPROJECT_SCHEME), "gizmoproject:");
		assertTrue(SCHEME_MAPPING.containsKey(GTALK_SCHEME));
		assertEquals(SCHEME_MAPPING.get(GTALK_SCHEME), "gtalk:");
		assertTrue(SCHEME_MAPPING.containsKey(HAM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(HAM_SCHEME), "ham:");
		assertTrue(SCHEME_MAPPING.containsKey(HCP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(HCP_SCHEME), "hcp:");
		assertTrue(SCHEME_MAPPING.containsKey(ICON_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ICON_SCHEME), "icon:");
		assertTrue(SCHEME_MAPPING.containsKey(IPN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IPN_SCHEME), "ipn:");
		assertTrue(SCHEME_MAPPING.containsKey(IRC_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRC_SCHEME), "irc:");
		assertTrue(SCHEME_MAPPING.containsKey(IRC6_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRC6_SCHEME), "irc6:");
		assertTrue(SCHEME_MAPPING.containsKey(IRCS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(IRCS_SCHEME), "ircs:");
		assertTrue(SCHEME_MAPPING.containsKey(ITMS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(ITMS_SCHEME), "itms:");
		assertTrue(SCHEME_MAPPING.containsKey(JAR_SCHEME));
		assertEquals(SCHEME_MAPPING.get(JAR_SCHEME), "jar:");
		assertTrue(SCHEME_MAPPING.containsKey(JMS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(JMS_SCHEME), "jms:");
		assertTrue(SCHEME_MAPPING.containsKey(KEYPARC_SCHEME));
		assertEquals(SCHEME_MAPPING.get(KEYPARC_SCHEME), "keyparc:");
		assertTrue(SCHEME_MAPPING.containsKey(LASTFM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(LASTFM_SCHEME), "lastfm:");
		assertTrue(SCHEME_MAPPING.containsKey(LDAPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(LDAPS_SCHEME), "ldaps:");
		assertTrue(SCHEME_MAPPING.containsKey(MAGNET_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MAGNET_SCHEME), "magnet:");
		assertTrue(SCHEME_MAPPING.containsKey(MAPS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MAPS_SCHEME), "maps:");
		assertTrue(SCHEME_MAPPING.containsKey(MARKET_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MARKET_SCHEME), "market:");
		assertTrue(SCHEME_MAPPING.containsKey(MESSAGE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MESSAGE_SCHEME), "message:");
		assertTrue(SCHEME_MAPPING.containsKey(MMS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MMS_SCHEME), "mms:");
		assertTrue(SCHEME_MAPPING.containsKey(MS_HELP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MS_HELP_SCHEME), "ms-help:");
		assertTrue(SCHEME_MAPPING.containsKey(MS_SETTINGS_POWER_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MS_SETTINGS_POWER_SCHEME), "ms-settings-power:");
		assertTrue(SCHEME_MAPPING.containsKey(MSNIM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MSNIM_SCHEME), "msnim:");
		assertTrue(SCHEME_MAPPING.containsKey(MUMBLE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MUMBLE_SCHEME), "mumble:");
		assertTrue(SCHEME_MAPPING.containsKey(MVN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MVN_SCHEME), "mvn:");
		assertTrue(SCHEME_MAPPING.containsKey(NOTES_SCHEME));
		assertEquals(SCHEME_MAPPING.get(NOTES_SCHEME), "notes:");
		assertTrue(SCHEME_MAPPING.containsKey(OID_SCHEME));
		assertEquals(SCHEME_MAPPING.get(OID_SCHEME), "oid:");
		assertTrue(SCHEME_MAPPING.containsKey(PALM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PALM_SCHEME), "palm:");
		assertTrue(SCHEME_MAPPING.containsKey(PAPARAZZI_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PAPARAZZI_SCHEME), "paparazzi:");
		assertTrue(SCHEME_MAPPING.containsKey(PKCS11_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PKCS11_SCHEME), "pkcs11:");
		assertTrue(SCHEME_MAPPING.containsKey(PLATFORM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PLATFORM_SCHEME), "platform:");
		assertTrue(SCHEME_MAPPING.containsKey(PROXY_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PROXY_SCHEME), "proxy:");
		assertTrue(SCHEME_MAPPING.containsKey(PSYC_SCHEME));
		assertEquals(SCHEME_MAPPING.get(PSYC_SCHEME), "psyc:");
		assertTrue(SCHEME_MAPPING.containsKey(QUERY_SCHEME));
		assertEquals(SCHEME_MAPPING.get(QUERY_SCHEME), "query:");
		assertTrue(SCHEME_MAPPING.containsKey(RES_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RES_SCHEME), "res:");
		assertTrue(SCHEME_MAPPING.containsKey(RESOURCE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RESOURCE_SCHEME), "resource:");
		assertTrue(SCHEME_MAPPING.containsKey(RMI_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RMI_SCHEME), "rmi:");
		assertTrue(SCHEME_MAPPING.containsKey(RSYNC_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RSYNC_SCHEME), "rsync:");
		assertTrue(SCHEME_MAPPING.containsKey(RTMFP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RTMFP_SCHEME), "rtmfp:");
		assertTrue(SCHEME_MAPPING.containsKey(RTMP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(RTMP_SCHEME), "rtmp:");
		assertTrue(SCHEME_MAPPING.containsKey(SECONDLIFE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SECONDLIFE_SCHEME), "secondlife:");
		assertTrue(SCHEME_MAPPING.containsKey(SFTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SFTP_SCHEME), "sftp:");
		assertTrue(SCHEME_MAPPING.containsKey(SGN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SGN_SCHEME), "sgn:");
		assertTrue(SCHEME_MAPPING.containsKey(SKYPE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SKYPE_SCHEME), "skype:");
		assertTrue(SCHEME_MAPPING.containsKey(SMB_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SMB_SCHEME), "smb:");
		assertTrue(SCHEME_MAPPING.containsKey(SMTP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SMTP_SCHEME), "smtp:");
		assertTrue(SCHEME_MAPPING.containsKey(SOLDAT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SOLDAT_SCHEME), "soldat:");
		assertTrue(SCHEME_MAPPING.containsKey(SPOTIFY_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SPOTIFY_SCHEME), "spotify:");
		assertTrue(SCHEME_MAPPING.containsKey(SSH_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SSH_SCHEME), "ssh:");
		assertTrue(SCHEME_MAPPING.containsKey(STEAM_SCHEME));
		assertEquals(SCHEME_MAPPING.get(STEAM_SCHEME), "steam:");
		assertTrue(SCHEME_MAPPING.containsKey(SUBMIT_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SUBMIT_SCHEME), "submit:");
		assertTrue(SCHEME_MAPPING.containsKey(SVN_SCHEME));
		assertEquals(SCHEME_MAPPING.get(SVN_SCHEME), "svn:");
		assertTrue(SCHEME_MAPPING.containsKey(TEAMSPEAK_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TEAMSPEAK_SCHEME), "teamspeak:");
		assertTrue(SCHEME_MAPPING.containsKey(TELIAEID_SCHEME));
		assertEquals(SCHEME_MAPPING.get(TELIAEID_SCHEME), "teliaeid:");
		assertTrue(SCHEME_MAPPING.containsKey(THINGS_SCHEME));
		assertEquals(SCHEME_MAPPING.get(THINGS_SCHEME), "things:");
		assertTrue(SCHEME_MAPPING.containsKey(UDP_SCHEME));
		assertEquals(SCHEME_MAPPING.get(UDP_SCHEME), "udp:");
		assertTrue(SCHEME_MAPPING.containsKey(UNREAL_SCHEME));
		assertEquals(SCHEME_MAPPING.get(UNREAL_SCHEME), "unreal:");
		assertTrue(SCHEME_MAPPING.containsKey(UT2004_SCHEME));
		assertEquals(SCHEME_MAPPING.get(UT2004_SCHEME), "ut2004:");
		assertTrue(SCHEME_MAPPING.containsKey(VENTRILO_SCHEME));
		assertEquals(SCHEME_MAPPING.get(VENTRILO_SCHEME), "ventrilo:");
		assertTrue(SCHEME_MAPPING.containsKey(VIEW_SOURCE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(VIEW_SOURCE_SCHEME), "view-source:");
		assertTrue(SCHEME_MAPPING.containsKey(WEBCAL_SCHEME));
		assertEquals(SCHEME_MAPPING.get(WEBCAL_SCHEME), "webcal:");
		assertTrue(SCHEME_MAPPING.containsKey(WTAI_SCHEME));
		assertEquals(SCHEME_MAPPING.get(WTAI_SCHEME), "wtai:");
		assertTrue(SCHEME_MAPPING.containsKey(WYCIWYG_SCHEME));
		assertEquals(SCHEME_MAPPING.get(WYCIWYG_SCHEME), "wyciwyg:");
		assertTrue(SCHEME_MAPPING.containsKey(XFIRE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XFIRE_SCHEME), "xfire:");
		assertTrue(SCHEME_MAPPING.containsKey(XRI_SCHEME));
		assertEquals(SCHEME_MAPPING.get(XRI_SCHEME), "xri:");
		assertTrue(SCHEME_MAPPING.containsKey(YMSGR_SCHEME));
		assertEquals(SCHEME_MAPPING.get(YMSGR_SCHEME), "ymsgr:");
		assertTrue(SCHEME_MAPPING.containsKey(EXAMPLE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(EXAMPLE_SCHEME), "example:");
		assertTrue(SCHEME_MAPPING.containsKey(MS_SETTINGS_CLOUDSTORAGE_SCHEME));
		assertEquals(SCHEME_MAPPING.get(MS_SETTINGS_CLOUDSTORAGE_SCHEME), "ms-settings-cloudstorage:");

	}
}