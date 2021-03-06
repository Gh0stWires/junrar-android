/* AllCertificatesSamePolicyTest1_3.java
   Copyright (C) 2003  Free Software Foundation, Inc.

   Distributed under the GPL; see the file `COPYING' */

// Tags: PKITS

package gnu.testlet.gnu.crypto.pki.pkits;

import java.security.cert.PKIXParameters;
import java.util.Collections;

public class AllCertificatesSamePolicyTest1_3 extends BaseInvalidTest
{
  public AllCertificatesSamePolicyTest1_3()
  {
    super (new String[] { "data/certs/ValidCertificatePathTest1EE.crt",
                          "data/certs/GoodCACert.crt" },
           new String[] { "data/crls/GoodCACRL.crl" });
  }

  protected void setupAdditionalParams (PKIXParameters params)
  {
    params.setExplicitPolicyRequired (true);
    params.setInitialPolicies (Collections.singleton (NIST_TEST_POLICY_2));
  }
}
