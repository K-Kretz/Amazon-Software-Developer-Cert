
SELECT District, SUM(Population) as totalPopulation
FROM city
GROUP BY District;
