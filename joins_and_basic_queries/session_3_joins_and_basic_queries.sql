-- Session 3: Joins & Basic Queries
-- Folder: joins_and_basic_queries

-- Optional reference tables for the join-based use cases
CREATE TABLE IF NOT EXISTS countries (
    country_name VARCHAR(50) PRIMARY KEY,
    continent VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS continents (
    continent_name VARCHAR(50) PRIMARY KEY
);

-- Use Case 1: Find Highest Confirmed Cases using INNER JOIN
-- Retrieve the country with the highest confirmed cases on a specific date.
SELECT
    c.country_name AS country,
    cc.date,
    cc.confirmed_cases
FROM covid_cases AS cc
INNER JOIN countries AS c
    ON cc.country = c.country_name
WHERE cc.date = '2021-01-01'
ORDER BY cc.confirmed_cases DESC
LIMIT 1;

-- Use Case 2: Join COVID Deaths and Vaccination Data
-- Show death counts and vaccination status for all countries, including missing vaccination data.
SELECT
    cd.country,
    cd.date,
    cd.deaths,
    cv.vaccinated
FROM covid_deaths AS cd
LEFT JOIN covid_vaccines AS cv
    ON cd.country = cv.country
   AND cd.date = cv.date
ORDER BY cd.country, cd.date;

-- Use Case 3: Analyze Deaths by Continent
-- Calculate total deaths per continent using JOIN and GROUP BY.
SELECT
    ct.continent_name AS continent,
    SUM(cc.deaths) AS total_deaths
FROM covid_cases AS cc
INNER JOIN countries AS c
    ON cc.country = c.country_name
INNER JOIN continents AS ct
    ON c.continent = ct.continent_name
GROUP BY ct.continent_name
ORDER BY total_deaths DESC;

-- Use Case 4: Calculate Average New Deaths Per Day
-- Calculate the average daily death count over time.
SELECT
    date,
    AVG(deaths) AS avg_daily_deaths
FROM covid_deaths
GROUP BY date
ORDER BY date;


SELECT
    country,
    (confirmed_cases * 100.0 / population) AS infection_rate
FROM covid_cases
WHERE population > 0
ORDER BY infection_rate DESC;
