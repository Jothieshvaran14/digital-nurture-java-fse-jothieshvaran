BEGIN
    FOR c IN (
        SELECT c.CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) Age,
               l.LoanID,
               l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID=l.CustomerID
    )
    LOOP
        IF c.Age>60 THEN
            UPDATE Loans
            SET InterestRate=InterestRate-1
            WHERE LoanID=c.LoanID;
        END IF;
    END LOOP;

    COMMIT;
END;
/