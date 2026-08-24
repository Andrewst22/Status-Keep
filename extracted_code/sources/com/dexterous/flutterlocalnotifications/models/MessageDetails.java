package com.dexterous.flutterlocalnotifications.models;

import d.InterfaceC0249a;
import java.io.Serializable;
@InterfaceC0249a
/* loaded from: classes.dex */
public class MessageDetails implements Serializable {
    public String dataMimeType;
    public String dataUri;
    public PersonDetails person;
    public String text;
    public Long timestamp;

    public MessageDetails(String str, Long l3, PersonDetails personDetails, String str2, String str3) {
        this.text = str;
        this.timestamp = l3;
        this.person = personDetails;
        this.dataMimeType = str2;
        this.dataUri = str3;
    }
}
