/* AllCertificatesSamePoliciesTest13_3.java
   Copyright (C) 2004  Free Software Foundation, Inc.

   Distributed under the GPL; see the file `COPYING' */

// Tags: PKITS

package gnu.testlet.gnu.crypto.pki.pkits;

import java.security.cert.PKIXParameters;
import java.util.Collections;

public class AllCertificatesSamePoliciesTest13_3 extends BaseValidTest
{
  public AllCertificatesSamePoliciesTest13_3()
  {
    super (new String[] { "data/certs/AllCertificatesSamePoliciesTest13EE.crt",
                          "data/certs/PoliciesP123CACert.crt" },
           new String[] { "data/crls/PoliciesP123CACRL.crl" });
  }

  protected void setupAdditionalParams (PKIXParameters params)
  {
    params.setInitialPolicies (Collections.singleton (NIST_TEST_POLICY_3));
  }
}
