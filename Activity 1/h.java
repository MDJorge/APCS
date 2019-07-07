\documentclass[a4paper,12pt]{article}
% Uncomment the following line to allow the usage of graphics (.png, .jpg)
\usepackage{amsmath}
% Allow the usage of utf8 characters
\usepackage[utf8]{inputenc}
\usepackage[english]{babel}
\usepackage{fancyhdr}

\pagestyle{fancy}
\fancyhf{}
\lhead{Jorge Monzon Diaz}
\rhead{5-14-15}

\usepackage{sectsty}
\usepackage{indentfirst}
\usepackage{lipsum}

\usepackage{textcomp}
\usepackage{gensymb}


\usepackage{commath}


\sectionfont{\centering}


\usepackage{helvet}
\renewcommand{\familydefault}{\sfdefault} 



% Start the document
\begin{document}


 \section*{Light Refraction}

 \subsection*{Question:}

\noindent Can you determine the index of refraction of an unknown material using a transparent box of material and a ray?

\subsection*{Materials:}

\begin{itemize}
\item Paper
\item Protractor
\item Ray box - a source of a narrow, bright, ray of light
\item Ruler
\item Samples of various transparent materials
\end{itemize}

\subsection*{Procedure:}

A ray box and a box of transparent material were placed on top of a sheet of paper and their positions were traced. The light ray was pointed towards the transparent box of material, causing a refracted ray to come out of the box's other side. The light rays, the incident and refracted ones, were then traced onto the sheet of paper. After the ray box was removed, those lines were extended. Then a normal line (a $90\degree$ perpendicular line) was drawn against the side of the transparent box where the light ray entered. A protractor was then used to measure the angle between the incident ray and the normal ($\theta_{I}$), and the angle between the refracted ray and the normal was also measured ($\theta_{R}$). The equation $n_{I}sin(\theta_{I}) = n_{R}sin(\theta_{R})$ was used to calculate for $n_{R}$, since the value for $n_{I}$ (index of refraction for the air) was known. 

\subsection*{Diagrams:}
\textit{See Attached}

\subsection*{Data and Calculations}

\begin{tabular}{|c|c|c|c|}
  \hline
   & $Item\; 1$ & $Item\; 2$ & $Item\; 3$ \\
 \cline{1-4}
  $n_{I}$ & $1$ & $1$ & $1$ \\
 $\theta_{I}$ & $32.0\degree$ & $20.0\degree$ & $28.8\degree$ \\
 $n_{R}$ & $19.5\degree$ & $15.0\degree$ & $25.5\degree$ \\
   \cline{1-4}
  $n_{R}$ & $1.57$ & $1.32$ & $1.12$ \\
  \hline 
\end{tabular} \\ \\

Sample Calculation:

\begin{equation}
n_{I}sin(\theta_{I}) = n_{R}sin(\theta_{R})
\end{equation}

\begin{equation}
1sin(32.0\degree) = n_{R}sin(19.5\degree)
\end{equation}

\begin{equation}
n_{R} = \frac{1sin(32\degree)}{sin(19.5\degree)}
\end{equation}

\begin{equation}
n_{R} = 1.57
\end{equation}

\subsection*{Results} 

\noindent Yes, the index can be found using a ray box, transparent box of the material, and a protractor. Though there were inaccuracies in the calculated indexes of refraction, the values were generally close to the actual indexes.

\subsection*{Error Analysis}

Percentages of Error \\ \\
\begin{tabular}{|c|c|c|c|}
  \hline
   $n_{R}$ & Item 1 (Corn Oil) & Item 2 (Glycerol) & Item 3 (Water) \\
 \cline{1-4}
 Calculated Values & $1.57$ & $1.32$ & $1.12$ \\
  Actual Values & $1.47$ & $1.47$ & $1.33$ \\
   \cline{1-4}
  Percentage of Error & $6.80\%$ & $10.2\%$ & $15.8\%$ \\
  \hline 
\end{tabular} \\ \\

Sample Calculation \\

\setcounter{equation}{0}

\begin{equation}
\% error = \frac{\abs{Accepted\; Value - Calculated\; Value}}{Accepted\; Value} * 100\%
\end{equation}

\begin{equation}
\% error = \frac{\abs{1.47 - 1.57}}{1.47} * 100\%
\end{equation}

\begin{equation}
\%error = 6.80\%
\end{equation} \\ \\

The calculated results weren't that far off from the actual values, and the percentage of error managed to stay below $16\%$. Some of the factors that could have affected the accuracy of the results were the protractor and ray box. The protractor was limited to a certain accuracy, and as a result the values we read off it could have been slightly off from their actual angles. The ray box produced a ray, but the width of that ray was not very small so when it was traced it might not have been traced exactly through the center of the ray. This could have also affected the measured angle. Ways to reduce the inaccuracy of these tools would be to use a protractor with more ticks to measure the angle more precisely, and to use a thinner more precise ray box. 

\subsection*{Conclusion:}

This lab was successful in verifying Snell's Law. It successfully calculated the index of refraction for an unknown material. The results were a bit off and had an average percentage of error or $10.9\%$, but they were pretty close to the actual indexes of the materials. This lab taught us how to utilize Snell's Law in a real world situation, and verified that it actually worked. Some real world applications of this could be figuring out what unknown possibly toxic materials are utilizing rays, the same procedure could be utilized to find the material's identifying index of refraction. The physics involved in this lab was light, and more specifically it's property of refraction.


\end{document}