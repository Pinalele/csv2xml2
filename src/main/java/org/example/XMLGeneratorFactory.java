package org.example;

import org.example.objects.AuditChangesIssueData;
import org.example.objects.LondonCaaMessageAudit;

public class XMLGeneratorFactory {
    public XMLGenerator getGenerator(int type) {
        switch (type) {
            case 0:
                return new LondonCaaMessageAudit();
            case 1:
                return new AuditChangesIssueData();
            default:
                throw new IllegalArgumentException("Tipo de XML não suportado: " + type);
        }
    }
}
