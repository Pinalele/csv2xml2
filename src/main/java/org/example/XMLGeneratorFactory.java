package org.example;

import org.example.london.generated.objects.AuditChangesIssueData;
import org.example.london.generated.objects.LondonCaaMessageAudit;

public class XMLGeneratorFactory {
    public XMLGenerator getGenerator(int type) {
        switch (type) {
            case 0:
                return new LondonCaaMessageAudit();
            case 1:
                return new AuditChangesIssueData();
            default:
                throw new IllegalArgumentException("XML not supported: " + type);
        }
    }
}
