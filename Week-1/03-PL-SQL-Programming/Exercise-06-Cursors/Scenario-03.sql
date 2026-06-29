DECLARE

CURSOR UpdateLoanInterestRates IS
SELECT LoanID
FROM Loans;

BEGIN

FOR loan IN UpdateLoanInterestRates LOOP

UPDATE Loans
SET InterestRate=InterestRate+0.5
WHERE LoanID=loan.LoanID;

END LOOP;

COMMIT;

END;
/