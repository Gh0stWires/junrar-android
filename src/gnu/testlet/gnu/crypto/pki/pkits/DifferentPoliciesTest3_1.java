/* DifferentPoliciesTest3_1.java
   Copyright (C) 2004  Free Software Foundation, Inc.

   Distributed under the GPL; see the file `COPYING' */

// Tags: PKITS

package gnu.testlet.gnu.crypto.pki.pkits;

import java.security.cert.PKIXParameters;

public class DifferentPoliciesTest3_1 extends BaseValidTest
{
  public DifferentPoliciesTest3_1()
  {
    super (new String[] { "data/certs/DifferentPoliciesTest3EE.crt",
                          "data/certs/PoliciesP2subCACert.crt",
                          "data/certs/GoodCACert.crt" },
           new String[] { "data/crls/PoliciesP2subCACRL.crl",
                          "data/crls/GoodCACRL.crl" });
  }

  protected void setupAdditionalParams (PKIXParameters params)
  {
  }
}
